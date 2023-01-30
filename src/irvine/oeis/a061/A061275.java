package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061275 Smaller of two consecutive primes whose sum is a square.
 * @author Sean A. Irvine
 */
public class A061275 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(mPrime.nextPrime(p)).isSquare()) {
        return p;
      }
    }
  }
}
