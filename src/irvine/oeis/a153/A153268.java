package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153268 Decimal expansion of log_10 (5).
 * @author Sean A. Irvine
 */
public class A153268 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153268() {
    super(CR.FIVE.log().divide(CR.TEN.log()));
  }
}
