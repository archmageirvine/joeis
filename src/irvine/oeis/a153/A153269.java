package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153269 Decimal expansion of log_11 (5).
 * @author Sean A. Irvine
 */
public class A153269 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153269() {
    super(CR.FIVE.log().divide(CR.valueOf(11).log()));
  }
}
