package irvine.oeis.a307;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307980 Numbers k whose number of divisors is the square of the number of decimal digits of k.
 * @author Sean A. Irvine
 */
public class A307980 implements Sequence {

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
      if (Cheetah.factor(mN).sigma0().equals(mLenSquared)) {
        return Z.valueOf(mN);
      }
    }
  }
}
