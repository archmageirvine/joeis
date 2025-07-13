package irvine.oeis.a278;

import irvine.math.z.Z;
import irvine.oeis.a023.A023330;

/**
 * A278932 Numbers n such that n remains prime through 6 iterations of function f(x) = 2x + 1.
 * @author Sean A. Irvine
 */
public class A278932 extends A023330 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(64).add(63))) {
        return p;
      }
    }
  }
}
