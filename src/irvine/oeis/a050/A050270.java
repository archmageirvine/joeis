package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050270 Largest value b for Diophantine 1-doubles (a,b) ordered by smallest b.
 * @author Sean A. Irvine
 */
public class A050270 extends Sequence1 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      final long s2 = mN * mM + 1;
      final long s = LongUtils.sqrt(s2);
      if (s * s == s2) {
        return Z.valueOf(mN);
      }
    }
  }
}

