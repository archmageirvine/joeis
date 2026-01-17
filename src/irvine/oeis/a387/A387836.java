package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A387836 Primes prime(i) such that (prime(i-1)+prime(i))^2 + prime(i)^2 is prime.
 * @author Sean A. Irvine
 */
public class A387836 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.prevPrime(p).add(p).square().add(p.square()).isProbablePrime()) {
        return p;
      }
    }
  }
}
