package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034310 Decimal part of a(n)^(1/4) starts with reversal of its integer part: first term of runs.
 * @author Sean A. Irvine
 */
public class A034310 implements Sequence {

  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);
  private boolean mStartOfRun = true;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(mN), ONE_QUARTER);
      final Z f = s.floor();
      final Z r = ZUtils.reverse(f);
      final int len = f.toString().length();
      if (s.frac().multiply(Z.TEN.pow(len)).floor().equals(r)) {
        if (mStartOfRun) {
          mStartOfRun = false;
          return mN;
        }
      } else {
        mStartOfRun = true;
      }
    }
  }
}

