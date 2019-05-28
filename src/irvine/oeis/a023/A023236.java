package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023236 Numbers n such that n and <code>9n + 10</code> both prime.
 * @author Sean A. Irvine
 */
public class A023236 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(10))) {
        return p;
      }
    }
  }
}
