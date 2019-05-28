package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023216 Numbers n such that n and <code>4n + 9</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023216 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(9))) {
        return p;
      }
    }
  }
}
