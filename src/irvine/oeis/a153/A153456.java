package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153456 Decimal expansion of log_22 (5).
 * @author Sean A. Irvine
 */
public class A153456 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153456() {
    super(0, CR.FIVE.log().divide(CR.valueOf(22).log()));
  }
}
