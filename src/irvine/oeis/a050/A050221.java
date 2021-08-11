package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a122.A122821;

/**
 * A050221 a(n) = number of sets of consecutive primes whose arithmetic mean is A060863(n).
 * @author Sean A. Irvine
 */
public class A050221 extends A122821 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
