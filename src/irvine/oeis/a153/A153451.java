package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153451 Decimal expansion of log_19 (5).
 * @author Sean A. Irvine
 */
public class A153451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153451() {
    super(CR.FIVE.log().divide(CR.valueOf(19).log()));
  }
}
