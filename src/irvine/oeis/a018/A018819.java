package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a000.A000123;

/**
 * A018819.
 * @author Sean A. Irvine
 */
public class A018819 extends A000123 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA != null) {
      final Z t = mA;
      mA = null;
      return t;
    }
    mA = super.next();
    return mA;
  }
}
