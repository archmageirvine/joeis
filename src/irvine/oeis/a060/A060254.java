package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A060254 Primes which are the sum of two consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060254 extends A002808 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z s = t.add(mA);
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
