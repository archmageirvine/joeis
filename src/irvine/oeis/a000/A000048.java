package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000048 Number of n-bead necklaces with beads of 2 colors and primitive period n, when turning over is not allowed but the two colors can be interchanged.
 * @author Sean A. Irvine
 */
public class A000048 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000048(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000048() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      if ((dd & 1) == 1) {
        final Z t = Z.ONE.shiftLeft(mN / dd);
        sum = sum.add(t.multiply(Functions.MOBIUS.i(dd)));
      }
    }
    return sum.divide(2L * mN);
  }

}

