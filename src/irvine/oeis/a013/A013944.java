package irvine.oeis.a013;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013944 Sum of terms in period of continued fraction for square root of the n-th nonsquare.
 * @author Sean A. Irvine
 */
public class A013944 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.isSquare()) {
        continue;
      }
      Z sum = null;
      for (final Z c : Convergents.continuedFractionConvergentsSqrt(mN)) {
        sum = sum == null ? Z.ZERO : sum.add(c);
      }
      return sum;
    }
  }
}
