package irvine.math.padic;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * Multiplication of two p-adics.
 * @author Sean A. Irvine
 */
public class Mul extends AbstractPAdic {

  public static PAdic multiply(final PAdic a, final PAdic b) {
    if (a.p() != b.p()) {
      throw new IllegalArgumentException();
    }
    final int vala = a.val();
    if (vala < 0) {
      return a;
    }
    final int valb = b.val();
    if (valb < 0) {
      return b;
    }
    return new Mul(a, b);
  }

  private final PAdic mA;
  private final PAdic mB;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;
  private Z mCarry = Z.ZERO;

  private Mul(final PAdic a, final PAdic b) {
    mA = a;
    mB = b;
  }

  @Override
  public long p() {
    return mA.p();
  }

  @Override
  public long get(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final long p = p();
    while (n >= mValid) {
      Z q = mCarry;
      for (int m = 0; m <= mValid; ++m) {
        q = q.add(mA.get(mValid - m) * mB.get(m));
      }
      final long r = q.mod(p);
      mExpansion.set(mValid++, r);
      mCarry = q.divide(p); // q.subtract(r).divide(p);
    }
    return mExpansion.get(n);
  }
}
