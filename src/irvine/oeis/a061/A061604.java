package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061604 Smallest multiple of n containing all 10 digits from 0 to 9.
 * @author Sean A. Irvine
 */
public class A061604 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = Math.max(1, 1023456789 / ++mN);
    while (true) {
      final long t = mN * m;
      if (LongUtils.syndrome(t) == 0b1111111111) {
        return Z.valueOf(t);
      }
      ++m;
    }
  }
}

