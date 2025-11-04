package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081531 Primes p such that (r-p)/log(p) &gt; 2, where r is the next prime after p.
 * @author Sean A. Irvine
 */
public class A081531 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (CR.valueOf(mPrime.nextPrime(p).subtract(p)).compareTo(CR.TWO.multiply(CR.valueOf(p).log())) > 0) {
        return p;
      }
    }
  }
}
