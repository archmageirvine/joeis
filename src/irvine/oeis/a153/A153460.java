package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153460 Decimal expansion of log_4 (6).
 * @author Sean A. Irvine
 */
public class A153460 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153460() {
    super(CR.SIX.log().divide(CR.FOUR.log()));
  }
}
