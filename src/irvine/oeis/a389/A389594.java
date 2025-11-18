package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389594 allocated for Dmitry Yampolsky.
 * @author Sean A. Irvine
 */
public class A389594 extends Sequence1 {

  private Z mA = null;
  private long mD = 0;
  private Z mPowerOfTwo = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (mPowerOfTwo.compareTo(mA.add(mD)) <= 0) {
        ++mD;
        mPowerOfTwo = mPowerOfTwo.multiply2();
      }
      mA = mA.add(mD);
    }
    return mA;
  }
}
