package irvine.oeis;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Generate an aliquot sequence.
 * @author Sean A. Irvine
 */
public class AliquotSequence extends Sequence0 {

  private Z mA = null;
  private final Z mStart;

  /**
   * Construct a new aliquot sequence.
   * @param start starting value
   */
  public AliquotSequence(final Z start) {
    mStart = start;
  }

  /**
   * Construct a new aliquot sequence.
   * @param start starting value
   */
  public AliquotSequence(final long start) {
    this(Z.valueOf(start));
  }

  @Override
  public Z next() {
    if (Z.ZERO.equals(mA)) {
      return null;
    }
    mA = mA == null ? mStart : Functions.ALIQUOT.z(mA);
    return mA;
  }
}
