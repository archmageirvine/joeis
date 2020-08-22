package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023212 Numbers n such that n and 4n + 1 are both prime.
 * @author Sean A. Irvine
 */
public class A023212 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(1))) {
        return p;
      }
    }
  }
}
