package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A084307 a(n) is the least number x such that gcd(sigma(x), sigma(x+1)) = n.
 * @author Sean A. Irvine
 */
public class A084307 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Z g = Functions.GCD.z(Functions.SIGMA1.z(++mM), Functions.SIGMA1.z(mM + 1));
      if (g.bitLength() < Long.SIZE) {
        final long d = g.longValue();
        if (mFirsts.get(d) == 0) {
          mFirsts.set(d, mM);
          if (mVerbose) {
            StringUtils.message("Solution for " + g + " is " + mM);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
