package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.PopCount;

/**
 * A006046.
 * @author Sean A. Irvine
 */
public class A006046 implements Sequence {

  private long mN = -1;

  /**
   * Compute explicitly a term of this sequence.
   * @param n term to compute
   * @return term
   */
  public static Z a(final long n) {
    if (n == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    final Z q = a(n / 2).multiply(3);
    if ((n & 1) == 0) {
      return q;
    }
    final int pop = (int) PopCount.popcount(n - 1);
    return q.add(Z.ONE.shiftLeft(pop));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
