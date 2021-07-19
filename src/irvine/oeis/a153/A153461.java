package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153461 Decimal expansion of log_5 (6).
 * @author Sean A. Irvine
 */
public class A153461 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153461() {
    super(CR.SIX.log().divide(CR.FIVE.log()));
  }
}
