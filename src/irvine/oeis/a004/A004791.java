package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004791.
 * @author Sean A. Irvine
 */
public class A004791 implements Sequence {

  private long mN = 1;
  private CR mLast = CR.ZERO;

  private CR mod1(final CR v) {
    return v.subtract(CR.valueOf(v.floor(32)));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final CR nfl = mod1(CR.valueOf(mN).log());
      if (nfl.compareTo(mLast) > 0) {
        mLast = nfl;
        return Z.valueOf(mN);
      }
    }
  }
}
