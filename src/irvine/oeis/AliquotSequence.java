package irvine.oeis;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Generate an aliquot sequence.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class AliquotSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private Z mA;

  /**
   * Construct a new aliquot sequence.
   * @param start starting value
   */
  public AliquotSequence(final Z start) {
    super(DEFOFF);
    mA = start;
  }

  /**
   * Construct a new aliquot sequence.
   * @param start starting value
   */
  public AliquotSequence(final long start) {
    this(Z.valueOf(start));
  }

  /**
   * Construct a new aliquot sequence.
   * @param offset first index
   * @param start starting value
   */
  public AliquotSequence(final int offset, final long start) {
    super(offset);
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    if (!mA.isZero()) {
      mA = Functions.ALIQUOT.z(mA);
    }
    return result;
  }
}
