package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008348.
 * @author Sean A. Irvine
 */
public class A008348 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final Z t = super.next();
      mA = mA.signedAdd(mA.compareTo(t) < 0, t);
    }
    return mA;
  }
}


