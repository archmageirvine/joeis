package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A018899 Smallest positive integer not representable as the sum of at most n distinct numbers of form <code>2^a*3^b</code>.
 * @author Sean A. Irvine
 */
public class A018899 extends A003586 {

  // After Jack Brennan

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private final DynamicLongArray mL = new DynamicLongArray();
  private long mLimit = 1L << 16;
  private int mTerms;
  {
    // Precompute 2^a * 3^b list
    final A003586 mSeq = new A003586();
    final Z lim = Z.valueOf(Long.MAX_VALUE);
    Z t;
    while ((t = mSeq.next()).compareTo(lim) < 0) {
      mL.set(mL.length(), t.longValueExact());
    }
  }

  private long getN() {
    long n = mLimit;
    while (n != 0) {
      if (mA.isSet(--n)) {
        for (int j = 0; j < mL.length() && n + mL.get(j) < mLimit; ++j) {
          mA.set(n + mL.get(j));
        }
      }
    }
    n = 0;
    while (mA.isSet(n) && ++n < mLimit) {
    }
    return n;
  }

  @Override
  public Z next() {
    if (!mA.isSet(0)) {
      mA.set(0);
      return Z.ONE;
    }
    while (true) {
      final long n = getN();
      if (n != mLimit) {
        ++mTerms;
        return Z.valueOf(n);
      }
      mLimit <<= 6; // Expand search region by factor of 64
      if (mLimit <= 0) {
        throw new UnsupportedOperationException();
      }
      mA = new LongDynamicBooleanArray();
      mA.set(0);
      // Run up, skip over already produced terms
      for (int k = 0; k < mTerms; ++k) {
        getN();
      }
      if (mVerbose) {
        StringUtils.message("Limit increased to " + mLimit);
      }
    }
  }
}

