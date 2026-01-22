package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A391603 Smallest k for which the number of divisors d of k such that A000005(d) = A000005(k/d) is equal to n.
 * @author Sean A. Irvine
 */
public class A391603 extends Sequence0 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (Functions.SIGMA0.l(++mM) >= mN) {
        int cnt = 0;
        for (final Z d : Jaguar.factor(mM).divisors()) {
          if (Functions.SIGMA0.z(d).equals(Functions.SIGMA0.z(mM / d.longValue()))) {
            ++cnt;
          }
        }
        if (mFirsts.get(cnt) == 0) {
          mFirsts.set(cnt, mM);
          if (mVerbose) {
            StringUtils.message("Solution for n=" + cnt + " is " + mM);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
