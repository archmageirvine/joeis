package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023312.
 * @author Sean A. Irvine
 */
public class A023312 extends A023282 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(256).add(765))) {
        return p;
      }
    }
  }
}
