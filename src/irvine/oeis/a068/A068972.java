package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068972 Multipliers resulting from A068665.
 * @author Sean A. Irvine
 */
public class A068972 extends A068665 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
