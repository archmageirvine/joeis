package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023355.
 * @author Sean A. Irvine
 */
public class A023355 extends A023327 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(59049).add(73810))) {
        return p;
      }
    }
  }
}
