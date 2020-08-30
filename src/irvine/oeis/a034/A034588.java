package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034588 Primes p such that the Fibonacci iterations starting with (1, p) lead to a "nine digits anagram".
 * @author Sean A. Irvine
 */
public class A034588 extends A034587 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a == null || a.isProbablePrime()) {
        return a;
      }
    }
  }
}
