package irvine.oeis.a004;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004106 Number of line-self-dual nets (or edge-self-dual nets) with n nodes.
 * @author Sean A. Irvine
 */
public class A004106 implements Sequence {

  private int mN = -1;

  private Z fix(final int[] j) {
    int e3 = 0;
    for (int t = 1; t < j.length; ++t) {
      for (int r = 1; r < t; ++r) {
        if ((IntegerUtils.lcm(r, t) & 1) == 0) {
          e3 += IntegerUtils.gcd(r, t) * j[r] * j[t];
        }
      }
    }
    for (int k = 1; k < j.length; ++k) {
      if ((k & 1) == 0) {
        if (2 * k < j.length) {
          e3 += j[2 * k];
        }
        e3 += (k / 2 - 1) * j[k];
        e3 += k * j[k] * (j[k] - 1) / 2;
      }
    }
    int e2 = 0;
    for (int k = 1; k < j.length; ++k) {
      e2 += j[k];
    }
    return Z.THREE.pow(e3).shiftLeft(e2);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    final int[] s = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, s);
      sum = sum.add(new Q(fix(s), SymmetricGroup.per(s)));
    }
    return sum.toZ();
  }
}

