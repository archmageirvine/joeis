package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023226 Numbers n such that n and <code>7n + 8</code> both prime.
 * @author Sean A. Irvine
 */
public class A023226 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(7).add(8))) {
        return p;
      }
    }
  }
}
