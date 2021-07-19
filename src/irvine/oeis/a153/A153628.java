package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153628 Decimal expansion of log_18 (7).
 * @author Sean A. Irvine
 */
public class A153628 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153628() {
    super(CR.SEVEN.log().divide(CR.valueOf(18).log()));
  }
}
