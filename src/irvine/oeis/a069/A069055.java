package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A069044.
 * @author Sean A. Irvine
 */
public class A069055 extends A003586 {

  private Z mA = super.next();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z t = mA;
    while (mA.compareTo(mN) < 0) {
      t = mA;
      mA = super.next();
    }
    return t;
  }
}

