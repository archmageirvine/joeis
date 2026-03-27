package irvine.oeis.a393;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A393833 Least integer k having exactly 2n+2 divisors such that the sequence of its 2n+1 proper divisors modulo n is a palindrome.
 * @author Sean A. Irvine
 */
public class A393833 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(2 * mN + 1) == 0) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z s0 = fs.sigma0();
      if (s0.isEven() && s0.bitLength() < Integer.SIZE) {
        final int len = s0.intValueExact() - 1;
        if (mFirsts.get(len) == 0) {
          final long[] s = new long[len];
          final int n = (len - 1) / 2;
          if (n != 0) {
            int k = 0;
            for (final Z d : fs.divisorsSorted()) {
              s[k] = d.mod(n);
              if (++k == s.length) {
                break;
              }
            }
            if (LongUtils.isPalindrome(s)) {
              if (mVerbose) {
                StringUtils.message("Solution for n=" + len / 2 + " is " + mM + " " + Arrays.toString(s));
              }
              mFirsts.set(len, mM);
            }
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(2 * mN + 1));
  }
}
