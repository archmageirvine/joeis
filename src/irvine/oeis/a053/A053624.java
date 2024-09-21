package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A053624 Highly composite odd numbers: odd numbers where d(n) increases to a record.
 * @author Sean A. Irvine
 */
public class A053624 extends A000005 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      super.next(); // skip even
      if (d.compareTo(mBest) > 0) {
        mBest = d;
        return Z.valueOf(mN - 1);
      }
    }
  }
}
