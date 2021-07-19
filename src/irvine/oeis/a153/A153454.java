package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153454 Decimal expansion of log_20 (5).
 * @author Sean A. Irvine
 */
public class A153454 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153454() {
    super(CR.FIVE.log().divide(CR.valueOf(20).log()));
  }
}
