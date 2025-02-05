package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074965 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (p.subtract(1).mod(q.subtract(p).multiply2()).isZero()) {
        return p;
      }
    }
  }
}
