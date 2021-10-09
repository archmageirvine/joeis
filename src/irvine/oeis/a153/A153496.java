package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153496 Decimal expansion of log_10 (6).
 * @author Sean A. Irvine
 */
public class A153496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153496() {
    super(CR.SIX.log().divide(CR.TEN.log()));
  }
}
