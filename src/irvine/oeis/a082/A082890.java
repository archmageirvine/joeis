package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082890 Primes p such that (r-p)/log(p) &gt; 5, where r is the next prime after p.
 * @author Sean A. Irvine
 */
public class A082890 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (CR.valueOf(mPrime.nextPrime(p).subtract(p)).compareTo(CR.valueOf(p).log().multiply(5)) > 0) {
        return p;
      }
    }
  }
}
