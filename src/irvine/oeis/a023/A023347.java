package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023347.
 * @author Sean A. Irvine
 */
public class A023347 extends A023319 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32768).add(4681))) {
        return p;
      }
    }
  }
}
