package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153204 Decimal expansion of log_8 (5).
 * @author Sean A. Irvine
 */
public class A153204 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153204() {
    super(CR.FIVE.log().divide(CR.EIGHT.log()));
  }
}
