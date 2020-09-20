package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007528;

/**
 * A034937 Primes p of the form 6k-1 such that 2*p + 3 is prime.
 * @author Sean A. Irvine
 */
public class A034937 extends A007528 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply2().add(3).isProbablePrime()) {
        return p;
      }
    }
  }
}
