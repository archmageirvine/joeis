package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010551.
 * @author Sean A. Irvine
 */
public class A010551 implements Sequence {

  private Z mA = null;
  private long mN = 1;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(mN);
      if (!mFirst) {
        mFirst = true;
        ++mN;
      } else {
        mFirst = false;
      }
    }
    return mA;
  }
}
