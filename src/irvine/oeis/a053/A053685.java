package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a045.A045378;

/**
 * A053685 Primes p &gt; 7 which are congruent to 2 or 4 (mod 5) for which 2p-1 is also prime.
 * @author Sean A. Irvine
 */
public class A053685 extends A045378 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply2().subtract(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
