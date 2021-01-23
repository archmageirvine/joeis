package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023327 Numbers n such that n remains prime through 4 iterations of function f(x) = 9x + 10.
 * @author Sean A. Irvine
 */
public class A023327 extends A023299 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6561).add(8200))) {
        return p;
      }
    }
  }
}
