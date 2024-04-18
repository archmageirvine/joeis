package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000013 Definition (1): Number of n-bead binary necklaces with beads of 2 colors where the colors may be swapped but turning over is not allowed.
 * @author Sean A. Irvine
 */
public class A000013 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000013(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000013() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    Z sum = Z.ZERO;
    // divisors below does not include 1
    for (final Z d : Jaguar.factor(n).divisors()) {
      final int ld = d.intValue();
      sum = sum.add(Functions.PHI.z(2L * ld).shiftLeft(mN / ld));
    }
    return sum.divide(2L * mN);
  }
}

