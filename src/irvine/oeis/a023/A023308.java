package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023308.
 * @author Sean A. Irvine
 */
public class A023308 extends A023278 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(81).add(160))) {
        return p;
      }
    }
  }
}
