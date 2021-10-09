package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153205 Decimal expansion of log_9 (5).
 * @author Sean A. Irvine
 */
public class A153205 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153205() {
    super(CR.FIVE.log().divide(CR.NINE.log()));
  }
}
