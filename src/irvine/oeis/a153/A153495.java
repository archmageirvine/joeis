package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153495 Decimal expansion of log_9 (6).
 * @author Sean A. Irvine
 */
public class A153495 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153495() {
    super(0, CR.SIX.log().divide(CR.NINE.log()));
  }
}
