package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002570 From a definite integral.
 * @author Sean A. Irvine
 */
public class A002570 extends A002571 {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mA.add(super.next());
      mA = mB;
      mB = t;
    }
    return mB;
  }

}
