package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153632 Decimal expansion of log_21 (7).
 * @author Sean A. Irvine
 */
public class A153632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153632() {
    super(CR.SEVEN.log().divide(CR.valueOf(21).log()));
  }
}
