package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023352 Numbers n such that n remains prime through 5 iterations of function f(x) = 9x + 2.
 * @author Sean A. Irvine
 */
public class A023352 extends A023324 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(59049).add(14762))) {
        return p;
      }
    }
  }
}
