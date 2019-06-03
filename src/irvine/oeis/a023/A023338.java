package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023338.
 * @author Sean A. Irvine
 */
public class A023338 extends A023310 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(243).add(1210))) {
        return p;
      }
    }
  }
}
