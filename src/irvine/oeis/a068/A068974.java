package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068974 Multipliers resulting from A068667.
 * @author Sean A. Irvine
 */
public class A068974 extends A068667 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
