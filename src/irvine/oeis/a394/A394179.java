package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a002.A002997;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A394179 Least Carmichael number (A002997) that is the product of exactly n primes congruent to 3 modulo 4.
 * @author Sean A. Irvine
 */
public class A394179 extends Sequence3 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private final Sequence mCarmichael = new A002997();
  private int mN = 2;

  private int count(final Z c) {
    final FactorSequence fs = Jaguar.factor(c);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) != 3) {
        return 0;
      }
      cnt += fs.getExponent(p);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z c = mCarmichael.next();
      final int cnt = count(c);
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, c);
        if (mVerbose) {
          StringUtils.message("Solution for " + cnt + " is " + c);
        }
      }
    }
    return mFirsts.get(mN);
  }
}
