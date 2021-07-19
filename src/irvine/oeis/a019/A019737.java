package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019737 Decimal expansion of sqrt(2*Pi)/21.
 * @author Sean A. Irvine
 */
public class A019737 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019737() {
    super(CR.TAU.sqrt().divide(CR.valueOf(21)));
  }
}
