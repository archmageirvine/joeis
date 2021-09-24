package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023206 Numbers m such that m and 2*m + 7 both prime.
 * @author Sean A. Irvine
 */
public class A023206 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply2().add(7))) {
        return p;
      }
    }
  }
}
