package irvine.math.padic;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * Addition of two p-adics.
 * @author Sean A. Irvine
 */
public class Add extends AbstractPAdic {

  private final PAdic mA;
  private final PAdic mB;
  private final DynamicLongArray mExpansion = new DynamicLongArray();
  private int mValid = 0;
  private Z mCarry = Z.ZERO;

  /**
   * Sum of two p-adics.
   * @param a summand
   * @param b summand
   */
  public Add(final PAdic a, final PAdic b) {
    if (a.p() != b.p()) {
      throw new IllegalArgumentException();
    }
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
      final Z q = mCarry.add(mA.get(mValid)).add(mB.get(mValid));
      final long r = q.mod(p);
      mExpansion.set(mValid++, r);
      mCarry = q.subtract(r).divide(p);
    }
    return mExpansion.get(n);
  }
}
