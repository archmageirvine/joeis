package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068684 Primes obtained as a concatenation p,q,p where p and q are successive primes and p&lt;q.
 * @author Sean A. Irvine
 */
public class A068684 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String q = mPrime.nextPrime(p).toString();
      final Z t = new Z(p + q + p);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
