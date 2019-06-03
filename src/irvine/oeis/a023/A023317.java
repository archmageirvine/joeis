package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023317 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 6x + 5</code>.
 * @author Sean A. Irvine
 */
public class A023317 extends A023288 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(1296).add(1295))) {
        return p;
      }
    }
  }
}
