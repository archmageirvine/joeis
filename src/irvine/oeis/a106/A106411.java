package irvine.oeis.a106;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A106411 Smallest number beginning with 1 that is the product of exactly n distinct primes.
 * @author Sean A. Irvine
 */
public class A106411 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private final char mLeadingDigit;
  private int mN;
  private Z mMin = null;

  protected A106411(final char leadingDigit) {
    super(leadingDigit == '1' ? 0 : 1);
    mN = leadingDigit == '1' ? -1 : 0;
    mLeadingDigit = leadingDigit;
  }

  /** Construct the sequence. */
  public A106411() {
    this('1');
  }

  private void search(final Z prod, final int remaining, final long p) {
    if (remaining == 0) {
      if (prod.toString().charAt(0) == mLeadingDigit && (mMin == null || prod.compareTo(mMin) < 0)) {
        mMin = prod;
      }
      return;
    }
    long q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (mMin != null && prod.multiply(Z.valueOf(q).pow(remaining)).compareTo(mMin) > 0) {
        return;
      }
      search(prod.multiply(q), remaining - 1, q);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE; // special case of leading digit 1, no prime factors
    }
    mMin = null;
    search(Z.ONE, mN, 1);
    return mMin;
  }
}
