package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000939 Number of inequivalent n-gons.
 * @author Sean A. Irvine
 */
public class A000939 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000939(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000939() {
    super(1);
  }

  private int mN = 0;

  private Z sum(final Z initial) {
    Z t = initial;
    for (int d = 1; d <= mN; ++d) {
      if (mN % d == 0) {
        final Z r = Z.valueOf(mN / d);
        t = t.add(Functions.PHI.z(r).square().multiply(Functions.FACTORIAL.z(d)).multiply(r.pow(d)));
      }
    }
    return t.divide(2L * mN * mN);
  }

  private Z even() {
    final int m = mN / 2;
    return sum(Functions.FACTORIAL.z(m).multiply(m).shiftLeft(m));
  }

  private Z odd() {
    return sum(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    return (mN & 1) == 0 ? even() : odd();
  }
}

