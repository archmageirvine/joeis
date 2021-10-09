package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153202 Decimal expansion of log_6 (5).
 * @author Sean A. Irvine
 */
public class A153202 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153202() {
    super(CR.FIVE.log().divide(CR.SIX.log()));
  }
}
