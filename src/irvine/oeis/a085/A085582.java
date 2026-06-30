package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085582 The number of rectangles (orthogonal or not) with corners on an n X n grid of points.
 * @author Sean A. Irvine
 */
public class A085582 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long s = 1; s < mN; ++s) {
      for (long r = s + 1; r < mN; ++r) {
        if (Functions.GCD.l(s, r) == 1) {
          for (long a = 1; a * s < mN && a * r < mN; ++a) {
            for (long b = 1; b * r < mN && b * s < mN; ++b) {
              final long t = Math.max(mN - a * s - b * r, 0) * Math.max(mN - a * r - b * s, 0);
              sum = sum.add(t);
            }
          }
        }
      }
    }
    return sum.multiply(2).add(Z.valueOf(mN).multiply(mN - 1).multiply(mN - 1).multiply(2 * mN - 1).divide(6));
  }
}
