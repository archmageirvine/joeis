package irvine.math.padic;

import irvine.util.array.DynamicLongArray;

/**
 * Square root of a p-adic.
 * @author Sean A. Irvine
 */
final class PAdicSqrt extends AbstractPAdic {

  static PAdic sqrt(final PAdic a) {
    final int vala = a.val();
    if (vala < 0) {
      return a;
    }
    return new PAdicSqrt(a);
  }

  private final PAdic mA;
  private PAdic mX = null;
  private final PAdic mTwo;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;

  private PAdicSqrt(final PAdic a) {
    mA = a;
    mTwo = PAdic.create(mA.p(), 2);
  }

  @Override
  public long p() {
    return mA.p();
  }

  private long q(final long a, final long p) {
    // todo this is crappy for large p
    for (long k = 0; k < p; ++k) {
      if ((k * k) % p == a) {
        return k;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public long get(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    while (n >= mValid) {
      if (mX == null) {
        mX = PAdic.create(mA.p(), q(mA.get(0), mA.p()));
      } else if ((mValid & (mValid - 1)) == 0) {
        mX = Div.divide(new Add(mX, Div.divide(mA, mX)), mTwo);
      }
      //System.out.println("a = " + mA.toString(10));
      //System.out.println("x = " + mX.toString(10));
      mExpansion.set(mValid, mX.get(mValid));
      mValid++;
    }
    return mExpansion.get(n);
  }
}
