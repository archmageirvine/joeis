package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023310 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 3x + 10</code>.
 * @author Sean A. Irvine
 */
public class A023310 extends A023280 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(81).add(400))) {
        return p;
      }
    }
  }
}
