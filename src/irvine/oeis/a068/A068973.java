package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068973 Multipliers resulting from A068666.
 * @author Sean A. Irvine
 */
public class A068973 extends A068666 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
