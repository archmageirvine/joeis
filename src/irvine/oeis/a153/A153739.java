package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153739 Decimal expansion of log_5 (8).
 * @author Sean A. Irvine
 */
public class A153739 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153739() {
    super(CR.EIGHT.log().divide(CR.FIVE.log()));
  }
}
