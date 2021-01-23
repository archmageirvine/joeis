package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037174 Primes which are not the sum of consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A037174 extends A037173 {

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
