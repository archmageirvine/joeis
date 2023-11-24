package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A066901 Let phi(k) determine the x-coordinate and prime(k) the y-coordinate of the point A(k). Sequence gives values of n such that points A(n), A(n+1) and A(n+2) form a right triangle with right angle at A(n+1).
 * @author Sean A. Irvine
 */
public class A066901 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mX1 = Z.ONE;
  private Z mY1 = Z.TWO;
  private Z mX2 = Z.ONE;
  private Z mY2 = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z x0 = mX1;
      final Z y0 = mY1;
      mX1 = mX2;
      mY1 = mY2;
      mX2 = Euler.phi(++mN + 2);
      mY2 = mPrime.nextPrime(mY1);
      final Z k1 = x0.subtract(mX1).square().add(y0.subtract(mY1).square());
      final Z k2 = mX1.subtract(mX2).square().add(mY1.subtract(mY2).square());
      final Z k3 = x0.subtract(mX2).square().add(y0.subtract(mY2).square());
      if (k1.add(k2).equals(k3)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
