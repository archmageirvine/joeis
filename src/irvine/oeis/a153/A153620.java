package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153620 Decimal expansion of log_10 (7).
 * @author Sean A. Irvine
 */
public class A153620 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153620() {
    super(CR.SEVEN.log().divide(CR.TEN.log()));
  }
}
