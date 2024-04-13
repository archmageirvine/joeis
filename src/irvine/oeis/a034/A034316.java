package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A034316 Decimal part of a(n)^(1/10) starts with reversal of its integer part: first term of runs.
 * @author Sean A. Irvine
 */
public class A034316 extends Sequence0 {

  private static final CR ONE_TENTH = CR.valueOf(new Q(1, 10));
  private boolean mStartOfRun = true;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(mN), ONE_TENTH);
      final Z f = s.floor();
      final Z r = Functions.REVERSE.z(f);
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

