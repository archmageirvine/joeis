package irvine.oeis.a083;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A083389 Numbers n such that the number formed by the digits of 2n sorted in descending order is equal to the sum of the divisors of n after the digits of each divisor have been sorted in descending order (all zeros dropped).
 * @author Sean A. Irvine
 */
public class A083389 implements Sequence {

  private long mN = 36;
  private final StringBuilder mBuffer = new StringBuilder();

  private long sortedForm(final long t) {
    final char[] s = String.valueOf(t).toCharArray();
    Arrays.sort(s);
    mBuffer.setLength(0);
    long r = 0;
    for (int k = s.length - 1; k >= 0 && s[k] != '0'; --k) {
      r *= 10;
      r += s[k] - '0';
    }
    return r;
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final long target = sortedForm(2 * mN);
      long sum = 0;
      for (final Z d : fs.divisors()) {
        sum += sortedForm(d.longValue());
      }
      if (sum == target) {
        return Z.valueOf(mN);
      }
    }
  }
}

