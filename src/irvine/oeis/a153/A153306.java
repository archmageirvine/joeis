package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153306 Decimal expansion of log_12 (5).
 * @author Sean A. Irvine
 */
public class A153306 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153306() {
    super(CR.FIVE.log().divide(CR.valueOf(12).log()));
  }
}
