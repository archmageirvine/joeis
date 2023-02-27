package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a036.A036275;

/**
 * A061564 Numbers k such that the repeating part of the decimal expansion of 1/k (omitting leading or trailing zeros) forms a prime number.
 * @author Sean A. Irvine
 */
public class A061564 extends A036275 {

  @Override
  public Z next() {
    while (true) {
      Z t = super.next();
      if (t.isZero()) {
        continue;
      }
      while (t.mod(10) == 0) {
        t = t.divide(10);
      }
      if (t.isProbablePrime()) {
        return mN;
      }
    }
  }
}

