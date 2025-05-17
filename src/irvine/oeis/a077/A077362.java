package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077362 Largest n-digit prime whose external digits as well as internal digits form a prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077362 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    if (mA.compareTo(Z.TEN) <= 0) {
      return Z.ZERO;
    }
    Z p = mA.multiply(10);
    while (true) {
      p = mPrime.prevPrime(p);
      final String t = p.toString();
      if (Predicates.PRIME.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0') && new Z(t.substring(1, t.length() - 1)).isProbablePrime()) {
        return p;
      }
    }
  }
}
