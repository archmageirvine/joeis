package irvine.oeis.a083;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083373 2n is equal to the sum of its divisors after the digits have been sorted in descending order (zeros dropped).
 * @author Sean A. Irvine
 */
public class A083373 extends Sequence1 {

  private long mN = 5;
  private final int[] mSpace = new int[10];
  private final StringBuilder mBuffer = new StringBuilder();

  private Z sortedForm(final Z t) {
    final char[] s = t.toString().toCharArray();
    Arrays.fill(mSpace, 0);
    for (final char c : s) {
      mSpace[c - '0']++;
    }
    mBuffer.setLength(0);
    for (int k = 9; k > 0; --k) {
      for (int j = mSpace[k]; j > 0; --j) {
        mBuffer.append(k);
      }
    }
    return new Z(mBuffer);
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = Z.ZERO;
      for (final Z d : fs.divisors()) {
        sum = sum.add(sortedForm(d));
      }
      if (sum.isEven() && sum.equals(2 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

