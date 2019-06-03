package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023324.
 * @author Sean A. Irvine
 */
public class A023324 extends A023296 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6561).add(1640))) {
        return p;
      }
    }
  }
}
