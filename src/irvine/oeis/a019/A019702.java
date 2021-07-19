package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019702 Decimal expansion of 2*Pi/21.
 * @author Sean A. Irvine
 */
public class A019702 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019702() {
    super(CR.TAU.divide(CR.valueOf(21)));
  }
}
