package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023303.
 * @author Sean A. Irvine
 */
public class A023303 extends A023273 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16).add(45))) {
        return p;
      }
    }
  }
}
