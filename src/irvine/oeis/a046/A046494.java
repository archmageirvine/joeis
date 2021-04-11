package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046494 Primes expressible as the sum of 2 consecutive palindromes.
 * @author Sean A. Irvine
 */
public class A046494 extends A002113 {

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
