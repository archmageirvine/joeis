package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A394476 a(n) is the smallest integer k such that the iterated multiplicative-order chain k, ord_k(3), ord_{ord_k(3)}(3), and so on, reaches a multiple of 3 in exactly n steps.
 * @author Sean A. Irvine
 */
public class A394476 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;

  private int count(long n) {
    int cnt = 0;
    while (n % 3 != 0) {
      if (n == 1 || Functions.GCD.l(n, 3) != 1) {
        return -1;
      }
      n = Functions.ORDER.l(n, 3);
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final int cnt = count(++mM);
      if (cnt >= 0 && mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
        if (mVerbose) {
          StringUtils.message("Solution for " + cnt + " is " + mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
