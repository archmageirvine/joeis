package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153356 Decimal expansion of log_15 (5).
 * @author Sean A. Irvine
 */
public class A153356 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153356() {
    super(CR.FIVE.log().divide(CR.valueOf(15).log()));
  }
}
