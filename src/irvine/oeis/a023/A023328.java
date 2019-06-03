package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023328 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 10x + 3</code>.
 * @author Sean A. Irvine
 */
public class A023328 extends A023300 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(10000).add(3333))) {
        return p;
      }
    }
  }
}
