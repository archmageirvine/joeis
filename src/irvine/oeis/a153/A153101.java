package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153101 Decimal expansion of log_5 (4).
 * @author Sean A. Irvine
 */
public class A153101 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153101() {
    super(CR.FOUR.log().divide(CR.FIVE.log()));
  }
}
