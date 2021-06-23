package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004790 Numbers k &gt;= 2 such that if 1 &lt; j &lt; k then (fractional part of log k) &lt; (fractional part of log j).
 * @author Sean A. Irvine
 */
public class A004790 implements Sequence {

  private long mN = 1;
  private CR mLast = CR.ONE;

  private CR mod1(final CR v) {
    return v.subtract(CR.valueOf(v.floor()));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final CR nfl = mod1(CR.valueOf(mN).log());
      if (nfl.compareTo(mLast) < 0) {
        mLast = nfl;
        return Z.valueOf(mN);
      }
    }
  }
}
