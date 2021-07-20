package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019899 Decimal expansion of tangent of 1 degree.
 * @author Sean A. Irvine
 */
public class A019899 extends DecimalExpansionSequence {

  protected A019899(final long angle) {
    super(UnaryCRFunction.TAN.execute(CR.PI.multiply(angle).divide(CR.valueOf(180))));
  }

  /** Construct the sequence. */
  public A019899() {
    this(1);
  }
}
