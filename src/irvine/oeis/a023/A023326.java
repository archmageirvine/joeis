package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023326 Numbers n such that n remains prime through 4 iterations of the function f(x) = 9x + 8.
 * @author Sean A. Irvine
 */
public class A023326 extends A023298 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6561).add(6560))) {
        return p;
      }
    }
  }
}
