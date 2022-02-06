package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A054483 Numerator of lowest terms fraction from division of a highly composite number (1) by its predecessor.
 * @author Sean A. Irvine
 */
public class A054483 extends A002182 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(mA.gcd(t));
  }
}
