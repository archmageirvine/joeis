package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153268 Decimal expansion of log_10 (5).
 * @author Sean A. Irvine
 */
public class A153268 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153268() {
    super(0, CR.FIVE.log().divide(CR.LOG10));
  }
}
