package irvine.oeis.a307;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A307980 Numbers k whose number of divisors is the square of the number of decimal digits of k.
 * @author Sean A. Irvine
 */
public class A307980 extends Sequence1 {

  private long mN = 0;
  private long mLen = 1;
  private Z mLenSquared = Z.ONE;
  private long mT = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mT) {
        mT *= 10;
        mLenSquared = Z.valueOf(++mLen).square();
      }
      if (Jaguar.factor(mN).sigma0().equals(mLenSquared)) {
        return Z.valueOf(mN);
      }
    }
  }
}
