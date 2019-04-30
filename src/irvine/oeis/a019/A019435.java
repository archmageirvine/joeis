package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019435 Numbers k at which the fractional part of <code>tan(k)</code> reaches a record high.
 * @author Sean A. Irvine
 */
public class A019435 implements Sequence {

  // Cf. A016274

  private CR mBest = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    // This should be safe down to mBest of about 10^-12 and is definitely safe to the value below
    if (mN <= 12068659184L) {
      final double best = mBest.doubleValue();
      while (true) {
        final double d = Math.tan(++mN);
        double frac = d % 1;
        if (frac < 0) {
          frac = 1 + frac;
        }
        if (frac > best) {
           mBest = CR.valueOf(frac);
          return Z.valueOf(mN);
        }
      }
    }

    // More careful searching
    while (true) {
      final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
      CR frac = tan.subtract(CR.valueOf(tan.floor(32)));
      if (frac.signum() < 0) {
        frac = CR.ONE.add(frac);
      }
      if (frac.compareTo(mBest) > 0) {
        mBest = frac;
        return Z.valueOf(mN);
      }
    }
  }
}
