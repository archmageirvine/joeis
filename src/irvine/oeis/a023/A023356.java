package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023356 Numbers n such that n remains prime through 5 iterations of the function <code>f(x) = 10x + 3</code>.
 * @author Sean A. Irvine
 */
public class A023356 extends A023328 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(100000).add(33333))) {
        return p;
      }
    }
  }
}
