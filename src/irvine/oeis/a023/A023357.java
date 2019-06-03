package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023357.
 * @author Sean A. Irvine
 */
public class A023357 extends A023329 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(100000).add(99999))) {
        return p;
      }
    }
  }
}
