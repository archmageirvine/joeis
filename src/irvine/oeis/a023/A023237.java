package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023237 Numbers k such that k and 10*k + 1 are both prime.
 * @author Sean A. Irvine
 */
public class A023237 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(10).add(1))) {
        return p;
      }
    }
  }
}
