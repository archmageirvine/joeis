package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153458 Decimal expansion of log_24(5).
 * @author Sean A. Irvine
 */
public class A153458 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153458() {
    super(0, CR.FIVE.log().divide(CR.valueOf(24).log()));
  }
}
