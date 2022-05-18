package irvine.oeis.a025;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;
import irvine.util.string.StringUtils;

/**
 * A025282 Smallest number requiring n Fibonacci numbers to build using + and *.
 * @author Sean A. Irvine
 */
public class A025282 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicByteArray mComplexity = new LongDynamicByteArray();
  private byte mN = 0;
  private long mM = 0;
  private long mA = 1;
  private long mB = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      long min = mM - 1; // add 1 together mM times
      if (mM == mB) {
        // Matches the next Fibonacci number, hence requires only 1 number
        min = 1;
        final long t = mA + mB;
        mA = mB;
        mB = t;
        assert mB > mM;
      } else {
        // Deal with addition
        for (long a = 1, b = 1, t; b < mM; t = a + b, a = b, b = t) {
          final long c = 1 + mComplexity.get(mM - b);
          if (c < min) {
            min = c;
          }
        }
        // Deal with multiplication
        for (final Z dd : Jaguar.factor(mM).divisors()) {
          final long d = dd.longValue();
          if (d != 1 && d <= mM / d) {
            final long c = mComplexity.get(d) + mComplexity.get(mM / d);
            if (c < min) {
              min = c;
            }
          }
        }
      }
      if (min > 127) {
        throw new UnsupportedOperationException();
      }
      mComplexity.set(mM, (byte) min);
      if (mVerbose && (mM & 0xFFFFF) == 0) {
        StringUtils.message("m=" + mM + " -> " + min);
      }
      if (min >= mN) {
        if (min > mN) {
          StringUtils.message("Warning " + mM + " actually required more than " + mN + " numbers, please report this");
        }
        return Z.valueOf(mM);
      }
    }
  }
}
