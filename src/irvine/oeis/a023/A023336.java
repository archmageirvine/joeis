package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023336.
 * @author Sean A. Irvine
 */
public class A023336 extends A023308 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(243).add(484))) {
        return p;
      }
    }
  }
}
