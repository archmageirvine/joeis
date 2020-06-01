package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004980 n-th positive integer k such that if <code>1 &lt;= j &lt;</code> k then fractional part of k-th partial sum of harmonic series <code>&gt;</code> fractional part of j-th partial sum of harmonic series.
 * @author Sean A. Irvine
 */
public class A004980 implements Sequence {

  private long mN = 1;
  private CR mH = CR.ONE;
  private CR mF = CR.ZERO;

  private CR mod1(final CR v) {
    return v.subtract(CR.valueOf(v.floor()));
  }

  @Override
  public Z next() {
    while (true) {
      mH = mH.add(CR.valueOf(new Q(1, ++mN)));
      final CR nfr = mod1(mH);
      if (nfr.compareTo(mF) > 0) {
        mF = nfr;
        return Z.valueOf(mN);
      }
    }
  }
}

