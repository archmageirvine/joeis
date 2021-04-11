package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A046493 Primes expressible as the sum of 3 consecutive palindromic primes.
 * @author Sean A. Irvine
 */
public class A046493 extends A002385 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      final Z s = t.add(mA).add(mB);
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
