package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383594 allocated for Aaron Pieniozek.
 * @author Sean A. Irvine
 */
public class A383594 extends Sequence0 {

  private long mOddPrimeCount = 0;
  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mA.isOdd() && mA.isProbablePrime()) {
        mA = Z.TWO;
      } else {
        mA = mA.add(mN - mOddPrimeCount);
        if (mA.isOdd() && mA.isProbablePrime()) {
          ++mOddPrimeCount;
        }
      }
    }
    return mA;
  }
}
