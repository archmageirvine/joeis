package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153444 Decimal expansion of log_18 (5).
 * @author Sean A. Irvine
 */
public class A153444 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153444() {
    super(CR.FIVE.log().divide(CR.valueOf(18).log()));
  }
}
