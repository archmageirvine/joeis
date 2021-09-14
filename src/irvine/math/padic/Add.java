package irvine.math.padic;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * Addition of two p-adics.
 * @author Sean A. Irvine
 */
public class Add extends AbstractPAdic {

  private final PAdic mA;
  private final PAdic mB;
  private final ArrayList<Long> mExpansion = new ArrayList<>();
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
    while (n >= mExpansion.size()) {
      final int s = mExpansion.size();
      final Z q = mCarry.add(mA.get(s)).add(mB.get(s));
      final long r = q.mod(p);
      mExpansion.add(r);
      mCarry = q.divide(p); // q.subtract(r).divide(p);
    }
    return mExpansion.get(n);
  }
}
