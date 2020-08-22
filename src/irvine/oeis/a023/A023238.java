package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023238 Numbers n such that n and 10n + 3 are both prime.
 * @author Sean A. Irvine
 */
public class A023238 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(10).add(3))) {
        return p;
      }
    }
  }
}
