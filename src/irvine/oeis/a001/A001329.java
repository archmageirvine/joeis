package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001329 Number of nonisomorphic groupoids with n elements.
 * @author Sean A. Irvine
 */
public class A001329 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001329(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001329() {
    super(0);
  }

  private int mN = start();

  protected int start() {
    return -1;
  }

  protected Z innerSum(final int[] j, final int m) {
    Z sum = Z.ZERO;
    for (int d = 1; d < j.length; ++d) {
      if (m % d == 0) {
        sum = sum.add((long) d * j[d]);
      }
    }
    return sum;
  }

  protected int scale() {
    return 1;
  }

  protected Z fix(final int[] j) {
    Z prod = Z.ONE;
    for (int r = 1; r < j.length; ++r) {
      for (int s = 1; s < j.length; ++s) {
        prod = prod.multiply(innerSum(j, Functions.LCM.i(r, s)).pow((long) scale() * j[r] * j[s] * Functions.GCD.i(r, s)));
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
      s = s.add(new Q(fix(a), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
