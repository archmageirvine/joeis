package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023304.
 * @author Sean A. Irvine
 */
public class A023304 extends A023274 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16).add(75))) {
        return p;
      }
    }
  }
}
