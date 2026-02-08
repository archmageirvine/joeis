package irvine.oeis.a214;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A214158 Smallest number with n as least nonnegative primitive root, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A214158 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN > 1 && Predicates.POWER.is(mN)) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long r = Functions.LEAST_PRIMITIVE_ROOT.l(++mM);
      if (mFirsts.get(r) == 0) {
        mFirsts.set(r, mM);
        if (mVerbose) {
          StringUtils.message("Solution for " + r + " is " + mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
