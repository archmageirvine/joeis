package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A393541 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A393541 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final int omega = fs.omega();
      if (omega * (omega - 1) / 2 >= mN) {
        final long[] primes = ZUtils.toLong(fs.toZArray());
        int cnt = 0;
        for (final long p : primes) {
          for (final long q : primes) {
            final long s = p + q;
            if (s > mM || q == p) {
              break;
            }
            for (final long r : primes) {
              final long t = s + r;
              if (t > mM || r == q) {
                break;
              }
              if (mM % t == 0) {
                ++cnt;
              }
            }
          }
        }
        if (cnt >= mN && mFirsts.get(cnt) == 0) {
          mFirsts.set(cnt, mM);
          if (mVerbose) {
            StringUtils.message("Solution for " + cnt + " is " + mM);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

