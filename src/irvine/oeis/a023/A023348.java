package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023348.
 * @author Sean A. Irvine
 */
public class A023348 extends A023320 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32768).add(14043))) {
        return p;
      }
    }
  }
}
