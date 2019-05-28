package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023231 Numbers n such that n and <code>8n + 7</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023231 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(7))) {
        return p;
      }
    }
  }
}
