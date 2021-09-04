package irvine.math.padic;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * Container for the p-adic expansion of a number.  These expansions are lazily
 * evaluated with terms computed on an as-needed basis.
 * @author Sean A. Irvine
*/
public class PAdicZ extends AbstractPAdic {

  private final long mPrime;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;
  private Z mCarry;

  PAdicZ(final long p, final Z n) {
    mPrime = p;
    mCarry = n;
  }

  @Override
  public long get(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    while (n >= mValid) {
      final long r = mCarry.mod(mPrime);
      mExpansion.set(mValid++, r);
      mCarry = mCarry.subtract(r).divide(mPrime);
    }
    return mExpansion.get(n);
  }

  @Override
  public long p() {
    return mPrime;
  }
}
