package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006839 Minimum of largest partial quotient of continued fraction for k/n, (k,n) = 1.
 * @author Sean A. Irvine
 */
public class A006839 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z minOfMax = null;
    for (long k = 1; k < mN && !Z.ONE.equals(minOfMax); ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        final Q f = new Q(k, mN);
        Z max = Z.ZERO;
        final Convergents conv = new Convergents(CR.valueOf(f));
        conv.next(); // skip a0 (it is always 0)
        while (true) {
          final Q t = conv.next();
          final boolean finishing = t.equals(f);
          final Z frac = conv.frac();
          // We ensure the last partial quotient is 1
          max = max.max(finishing ? frac.subtract(1) : frac);
          if (finishing) {
            break;
          }
        }
        if (minOfMax == null || minOfMax.compareTo(max) > 0) {
          minOfMax = max;
        }
      }
    }
    return minOfMax;
  }
}
