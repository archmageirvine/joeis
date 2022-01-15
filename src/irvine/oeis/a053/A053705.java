package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053705 Primes p of form q^k-2 where q is also a prime and k &gt; 1.
 * @author Sean A. Irvine
 */
public class A053705 extends A025475 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next().subtract(2);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
