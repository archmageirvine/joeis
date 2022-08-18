package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153455 Decimal expansion of log_21 (5).
 * @author Sean A. Irvine
 */
public class A153455 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153455() {
    super(0, CR.FIVE.log().divide(CR.valueOf(21).log()));
  }
}
