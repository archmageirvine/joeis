package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043292 Numbers that divide 10^k + 1 for some k.
 * @author Sean A. Irvine
 */
public class A043292 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN <= 2 && ++mN != 3) {
        return Z.valueOf(mN);
    }
    while (true) {
      mN += 2;
      long k2 = 10;
      for (long j = 1; j < mN; ++j) {
        if (k2 == mN - 1) {
          return Z.valueOf(mN);
        }
        k2 *= 10;
        k2 %= mN;
      }
    }
  }
}

