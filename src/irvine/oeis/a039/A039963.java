package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a035.A035263;

/**
 * A039963 The period-doubling sequence A035263 repeated.
 * @author Sean A. Irvine
 */
public class A039963 extends A035263 {

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

