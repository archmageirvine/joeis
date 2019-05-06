package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004796 n-th positive integer k such that if <code>2 &lt;= j &lt</code>; k then the fractional part of the k-th partial sum of harmonic series is <code>&lt</code>; the fractional part of the j-th partial sum of the harmonic series.
 * @author Sean A. Irvine
 */
public class A004796 implements Sequence {

  private long mN = 3;
  private CR mLast = CR.ONE;
  private Q mH = new Q(5, 6);

  private CR mod1(final CR v) {
    return v.subtract(CR.valueOf(v.floor()));
  }

  @Override
  public Z next() {
    while (true) {
      mH = mH.add(new Q(1, ++mN));
      final CR h = mod1(CR.valueOf(mH));
      if (h.compareTo(mLast) < 0) {
        mLast = h;
        return Z.valueOf(mN);
      }
    }
  }
}
