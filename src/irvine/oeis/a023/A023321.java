package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023321.
 * @author Sean A. Irvine
 */
public class A023321 extends A023293 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4096).add(2925))) {
        return p;
      }
    }
  }
}
