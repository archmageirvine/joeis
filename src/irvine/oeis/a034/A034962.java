package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034962 Primes that are the sum of three consecutive primes.
 * @author Sean A. Irvine
 */
public class A034962 extends A034961 {

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
