package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002467 The game of Mousetrap with n cards (given n letters and n envelopes, how many ways are there to fill the envelopes so that at least one letter goes into its right envelope?).
 * @author Sean A. Irvine
 */
public class A002467 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002467(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002467() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).signedAdd((mN & 1) == 1, Z.ONE);
    }
    return mA;
  }
}
