package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A394471 Primes of the form prime(k) + prime(k+2) - 1, where prime(k) is the k-th prime.
 * @author Sean A. Irvine
 */
public class A394471 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.add(mPrime.nextPrime(mPrime.nextPrime(p)).subtract(1));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
