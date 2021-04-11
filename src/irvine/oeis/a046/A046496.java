package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046496 Primes expressible as the sum of 4 consecutive palindromes.
 * @author Sean A. Irvine
 */
public class A046496 extends A002113 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = super.next();
      final Z s = t.add(mA).add(mB).add(mC);
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
