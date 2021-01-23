package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023346 Numbers n such that n remains prime through 5 iterations of function f(x) = 7x + 6.
 * @author Sean A. Irvine
 */
public class A023346 extends A023318 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16807).add(16806))) {
        return p;
      }
    }
  }
}
