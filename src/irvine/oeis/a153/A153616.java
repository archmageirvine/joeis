package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153616 Decimal expansion of log_5 (7).
 * @author Sean A. Irvine
 */
public class A153616 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153616() {
    super(CR.SEVEN.log().divide(CR.FIVE.log()));
  }
}
