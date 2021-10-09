package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153756 Decimal expansion of log_9 (8).
 * @author Sean A. Irvine
 */
public class A153756 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153756() {
    super(CR.EIGHT.log().divide(CR.NINE.log()));
  }
}
