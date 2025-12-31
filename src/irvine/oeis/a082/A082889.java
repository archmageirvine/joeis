package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082889 Primes p such that (r-p)/log(p) &gt; 4, where r is the next prime after p.
 * @author Sean A. Irvine
 */
public class A082889 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (CR.valueOf(mPrime.nextPrime(p).subtract(p)).compareTo(CR.valueOf(p).log().multiply(4)) > 0) {
        return p;
      }
    }
  }
}
