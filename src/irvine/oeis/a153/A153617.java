package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153617 Decimal expansion of log_6 (7).
 * @author Sean A. Irvine
 */
public class A153617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153617() {
    super(CR.SEVEN.log().divide(CR.SIX.log()));
  }
}
