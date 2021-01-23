package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016274 Fractional part of tan(n) decreases monotonically to 0.
 * @author Sean A. Irvine
 */
public class A016274 implements Sequence {

  // Actually ordinary IEEE double precision arithmetic is sufficient for known
  // terms up to at least 8984683956L.  But more careful here for later terms ...

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    // This should be safe down to mBest of about 10^-12 and is definitely safe to the value below
    if (mN < 8984683956L) {
      final double best = mBest.doubleValue();
      while (true) {
        final double d = Math.tan(++mN);
        double frac = d % 1;
        if (frac < 0) {
          frac = 1 + frac;
        }
        if (frac < best) {
           mBest = CR.valueOf(frac);
          return Z.valueOf(mN);
        }
      }
    }

    // More careful searching
    while (true) {
      final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
      CR frac = tan.subtract(CR.valueOf(tan.floor()));
      if (frac.signum() < 0) {
        frac = CR.ONE.add(frac);
      }
      if (frac.compareTo(mBest) < 0) {
        mBest = frac;
        return Z.valueOf(mN);
      }
    }
  }
}
