package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023201 Primes p such that p + 6 is also prime. (Lesser of a pair of sexy primes.).
 * @author Sean A. Irvine
 */
public class A023201 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(6))) {
        return p;
      }
    }
  }
}
