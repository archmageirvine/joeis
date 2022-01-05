package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A053640 Number of divisors of highly composite odd numbers (A053624).
 * @author Sean A. Irvine
 */
public class A053640 extends A000005 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      super.next(); // skip even
      if (d.compareTo(mBest) > 0) {
        mBest = d;
        return mBest;
      }
    }
  }
}
