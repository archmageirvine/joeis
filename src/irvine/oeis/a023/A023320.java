package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023320.
 * @author Sean A. Irvine
 */
public class A023320 extends A023292 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4096).add(1755))) {
        return p;
      }
    }
  }
}
