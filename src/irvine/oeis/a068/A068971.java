package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068971 Multipliers resulting from A068664.
 * @author Sean A. Irvine
 */
public class A068971 extends A068664 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
