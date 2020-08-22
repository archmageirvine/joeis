package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023234 Numbers n such that n and 9n + 4 are both prime.
 * @author Sean A. Irvine
 */
public class A023234 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(4))) {
        return p;
      }
    }
  }
}
