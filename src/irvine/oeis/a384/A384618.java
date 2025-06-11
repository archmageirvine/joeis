package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A384618 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A384618 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.prevPrime(p);
      final Z r = mPrime.nextPrime(p);
      final long s = p.subtract(q).longValue();
      final long t = r.subtract(p).longValue();
      if (Math.max(s, t) > 2 * Math.min(s, t)) {
        return p;
      }
    }
  }
}
