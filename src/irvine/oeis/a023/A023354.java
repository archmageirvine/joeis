package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023354 Numbers n such that n remains prime through 5 iterations of function f(x) = 9x + 8.
 * @author Sean A. Irvine
 */
public class A023354 extends A023326 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(59049).add(59048))) {
        return p;
      }
    }
  }
}
