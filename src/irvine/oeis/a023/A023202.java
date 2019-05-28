package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023202 Numbers n such that n and <code>n + 8</code> both prime.
 * @author Sean A. Irvine
 */
public class A023202 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(8))) {
        return p;
      }
    }
  }
}
