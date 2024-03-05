package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068683 Primes formed by the concatenation p,q,p where p and q are successive primes and p&gt;q.
 * @author Sean A. Irvine
 */
public class A068683 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String q = mPrime.nextPrime(p).toString();
      final Z t = new Z(q + p + q);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
