package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153615 Decimal expansion of log_4 (7).
 * @author Sean A. Irvine
 */
public class A153615 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153615() {
    super(CR.SEVEN.log().divide(CR.FOUR.log()));
  }
}
