package irvine.math.padic;

import irvine.util.array.DynamicLongArray;

/**
 * Division of two p-adics.
 * @author Sean A. Irvine
 */
final class Div extends AbstractPAdic {

  static PAdic divide(final PAdic a, final PAdic b) {
    if (a.p() != b.p()) {
      throw new IllegalArgumentException();
    }
    if (a == b) {
      return PAdic.create(a.p(), 1);
    }
    final int vala = a.val();
    if (vala < 0) {
      return a;
    }
    final int valb = b.val();
    if (valb < 0) {
      throw new ArithmeticException("Division by 0");
    }
    return new Div(a, b);
  }

  private PAdic mA;
  private final PAdic mB;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;

  private Div(final PAdic a, final PAdic b) {
    mA = a;
    mB = b;
  }

  @Override
  public long p() {
    return mA.p();
  }

  private long q(final long b, final long a, final long p) {
    // todo this is crappy for large p
    for (long k = 0; k < p; ++k) {
      if ((b * k) % p == a) {
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
    final long p = p();
    while (n >= mValid) {
      final long a = mA.get(0);
      if (a == 0) {
        mA = Shift.shift(mA, 1);
        mExpansion.set(mValid++, 0);
      } else {
        final long b = mB.get(0);
        // solve b * q = a (mod p)
        final long q = q(b, a, p);
        // update numbers
        final PAdic t = Mul.multiply(mB, PAdic.create(p, q));
        mA = Shift.shift(new Add(mA, new Negate(t)), 1);
        mExpansion.set(mValid++, q);
      }
    }
    return mExpansion.get(n);
  }
}
