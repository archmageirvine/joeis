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
    return new Mul(a, vala, b, valb);
  }

  private final PAdic mA;
  private final PAdic mB;
  private final int mValA;
  private final int mValB;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;
  private Z mCarry = Z.ZERO;

  private Mul(final PAdic a, final int vala, final PAdic b, final int valb) {
    mA = a;
    mB = b;
    mValA = vala;
    mValB = valb;
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
      final long a = mA.get(mValid);
      for (int m = 0; m <= mValid; ++m) {
        q = q.add(a * mB.get(m));
      }
      final long r = q.mod(p);
      mExpansion.set(mValid++, r);
      mCarry = q.subtract(r).divide(p);
    }
    return mExpansion.get(n);
  }
}
