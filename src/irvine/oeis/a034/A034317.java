package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034317 Decimal part of a(n)^(1/11) starts with reversal of its integer part: first term of runs.
 * @author Sean A. Irvine
 */
public class A034317 implements Sequence {

  private static final CR ONE_ELEVENTH = CR.valueOf(new Q(1, 11));
  private boolean mStartOfRun = true;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(mN), ONE_ELEVENTH);
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

