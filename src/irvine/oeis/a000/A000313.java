package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000313 Number of permutations of length n with 3 consecutive ascending pairs.
 * @author Sean A. Irvine
 */
public class A000313 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000313(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000313() {
    super(1);
  }

  private int mN = -2;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    if (++mN > 1) {
      final Z b = Functions.FACTORIAL.z(mN + 1);
      for (int k = 0; k <= mN; ++k) {
        final Z c = b.divide(Functions.FACTORIAL.z(k));
        s = s.signedAdd((k & 1) == 0, c);
      }
    }
    return s.multiply(mN).divide(6);
  }
}
