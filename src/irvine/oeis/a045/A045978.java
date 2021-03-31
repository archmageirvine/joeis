package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A045978 Palindromic primes that are "near miss circular primes" (all cyclic shifts except one are primes).
 * @author Sean A. Irvine
 */
public class A045978 extends A002385 {

  private boolean isNearCircular(final Z p) {
    final String s = p.toString();
    boolean sawNonPrime = false;
    for (int k = 1; k < s.length(); ++k) {
      if (!new Z(s.substring(k) + s.substring(0, k)).isProbablePrime()) {
        if (sawNonPrime) {
          return false;
        }
        sawNonPrime = true;
      }
    }
    return sawNonPrime;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isNearCircular(p)) {
        return p;
      }
    }
  }
}
