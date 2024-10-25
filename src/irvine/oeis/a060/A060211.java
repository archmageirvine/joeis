package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a058.A058383;

/**
 * A060211 Larger term of a pair of twin primes such that the prime factors of their average are only 2 and 3. Proper subset of A058383.
 * @author Sean A. Irvine
 */
public class A060211 extends A058383 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(2).isProbablePrime()) {
        return p;
      }
    }
  }
}

