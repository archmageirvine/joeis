package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A002182 Highly composite numbers, definition <code>(1)</code>: where d(n), the number of divisors of n (A000005), increases to a record.
 * @author Sean A. Irvine
 */
public class A002182 extends A000005 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      if (d.compareTo(mBest) > 0) {
        mBest = d;
        return Z.valueOf(mN);
      }
    }
  }
}
