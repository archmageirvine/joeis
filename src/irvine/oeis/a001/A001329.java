package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A001329.
 * @author Sean A. Irvine
 */
public class A001329 implements Sequence {

  private int mN = start();

  protected int start() {
    return -1;
  }

  protected Z innerSum(final int[] j, final int lcm) {
    Z sum = Z.ZERO;
    for (int d = 1; d < j.length; ++d) {
      if (lcm % d == 0) {
        sum = sum.add(d * j[d]);
      }
    }
    return sum;
  }

  protected int scale() {
    return 1;
  }

  protected Z t(final int[] j) {
    Z prod = Z.ONE;
    for (int r = 1; r < j.length; ++r) {
      for (int s = 1; s < j.length; ++s) {
        prod = prod.multiply(innerSum(j, IntegerUtils.lcm(r, s)).pow(scale() * j[r] * j[s] * IntegerUtils.gcd(r, s)));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      s = s.add(new Q(t(a), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
