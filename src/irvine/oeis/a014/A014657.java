package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014657 Numbers m that divide 2^k + 1 for some k.
 * @author Sean A. Irvine
 */
public class A014657 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN <= 2) {
      // Note mN == 2 is the only even term in this sequence
      return Z.valueOf(++mN);
    }
    while (true) {
      mN += 2;
      long k2 = 2;
      for (long j = 1; j < mN; ++j) {
        if (k2 == mN - 1) {
          return Z.valueOf(mN);
        }
        k2 <<= 1;
        k2 %= mN;
      }
    }
  }
}

