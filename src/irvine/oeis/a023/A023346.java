package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023346.
 * @author Sean A. Irvine
 */
public class A023346 extends A023318 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16807).add(16806))) {
        return p;
      }
    }
  }
}
