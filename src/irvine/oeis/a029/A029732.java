package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029732 Palindromic primes in base 16 (or hexadecimal), but written here in base 10.
 * @author Sean A. Irvine
 */
public class A029732 extends A029730 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
