package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034965 Primes that are sum of five consecutive primes.
 * @author Sean A. Irvine
 */
public class A034965 extends A034964 {

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
