package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004980.
 * @author Sean A. Irvine
 */
public class A004980 implements Sequence {

  private long mN = 1;
  private CR mH = CR.ONE;
  private CR mF = CR.ZERO;

  private CR mod1(final CR v) {
    return v.subtract(CR.valueOf(v.floor(32)));
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

