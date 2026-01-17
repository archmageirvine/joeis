package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A389254 Smallest k for which the number of divisors d of k such that A000005(d*k) = A000005(k + d) is equal to n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A389254 extends Sequence0 {

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
          if (Functions.SIGMA0.z(d.multiply(mM)).equals(Functions.SIGMA0.z(d.add(mM)))) {
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
