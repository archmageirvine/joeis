package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153201 Decimal expansion of log_4 (5).
 * @author Sean A. Irvine
 */
public class A153201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153201() {
    super(CR.FIVE.log().divide(CR.FOUR.log()));
  }
}
