package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A054481 Highest common factor of successive highly composite numbers (1), A002182.
 * @author Sean A. Irvine
 */
public class A054481 extends A002182 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.gcd(t);
  }
}
