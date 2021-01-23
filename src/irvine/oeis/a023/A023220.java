package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023220 Numbers n such that n and 5n + 8 are both prime.
 * @author Sean A. Irvine
 */
public class A023220 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(8))) {
        return p;
      }
    }
  }
}
