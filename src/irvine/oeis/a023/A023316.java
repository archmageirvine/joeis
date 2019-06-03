package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023316.
 * @author Sean A. Irvine
 */
public class A023316 extends A023286 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(625).add(1248))) {
        return p;
      }
    }
  }
}
