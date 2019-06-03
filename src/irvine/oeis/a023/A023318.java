package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023318.
 * @author Sean A. Irvine
 */
public class A023318 extends A023290 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(2401).add(2400))) {
        return p;
      }
    }
  }
}
