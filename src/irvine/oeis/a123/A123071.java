package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.a000.A000898;

/**
 * A123071.
 * @author Sean A. Irvine
 */
public class A123071 extends A000898 {

  private Z mA = super.next();
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      return mA.square();
    }
    final Z t = mA;
    mA = super.next();
    return t.multiply(mA);
  }
}
