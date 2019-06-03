package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023327.
 * @author Sean A. Irvine
 */
public class A023327 extends A023299 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6561).add(8200))) {
        return p;
      }
    }
  }
}
