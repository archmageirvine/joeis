package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019899 Decimal expansion of tangent of 1 degree.
 * @author Sean A. Irvine
 */
public class A019899 extends DecimalExpansionSequence implements SequenceWithOffset {

  private int mOffset = 0; // first index

  protected A019899(final long angle) {
    super(0, UnaryCRFunction.TAN.execute(CR.PI.multiply(angle).divide(CR.valueOf(180))));
  }

  protected A019899(final int offset, final long angle) {
    this(angle);
    mOffset = offset;
  }

  /** Construct the sequence. */
  public A019899() {
    this(1);
  }

  public int getOffset() {
    return mOffset;
  }
}
