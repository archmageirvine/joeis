package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083116 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 10 == 0 || mN % 16 == 0 || mN % 25 == 0) {
      return Z.ZERO;
    }
    Z t = Z.ZERO;
    while (true) {
      t = t.multiply(10).add(1);
      for (long j = 1; j < 10; ++j) {
        final Z u = t.multiply(j);
        if (u.mod(mN) == 0) {
          return u;
        }
      }
    }
  }
}

