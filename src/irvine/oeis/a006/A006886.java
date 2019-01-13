package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006886.
 * @author Sean A. Irvine
 */
public class A006886 implements Sequence {

  private long mN = 0;
  private long mSkip = 10;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (++mN == mSkip) {
        mSkip *= 10;
        continue;
      }
      final Z n = Z.valueOf(mN);
      final String s = n.square().toString();
      for (int k = 1; k < s.length(); ++k) {
        if (Long.parseLong(s.substring(0, k)) + Long.parseLong(s.substring(k)) == mN) {
          return n;
        }
      }
    }
  }
}
