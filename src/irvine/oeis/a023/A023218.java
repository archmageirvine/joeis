package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023218 Numbers n such that n and <code>5n + 4</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023218 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(4))) {
        return p;
      }
    }
  }
}
