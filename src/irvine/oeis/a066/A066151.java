package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A066151 Smallest n-digit number with A066150(n) divisors.
 * @author Sean A. Irvine
 */
public class A066151 extends A002182 {

  private Z mA = super.next();
  private Z mMax = Z.ONE;

  @Override
  public Z next() {
    mMax = mMax.multiply(10);
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.compareTo(mMax) >= 0) {
        return t;
      }
    }
  }
}
