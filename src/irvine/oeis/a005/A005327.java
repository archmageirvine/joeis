package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005327.
 * @author Sean A. Irvine
 */
public class A005327 implements Sequence {

  private Z mA = null;
  private long mAdd = 1;
  private Z mTwos = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mAdd = -mAdd;
      mTwos = mTwos.multiply2();
      mA = mA.multiply(mTwos.subtract(1)).add(mAdd);
    }
    return mA;
  }
}
