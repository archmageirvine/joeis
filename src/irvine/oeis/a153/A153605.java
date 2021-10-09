package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153605 Decimal expansion of log_15 (6).
 * @author Sean A. Irvine
 */
public class A153605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153605() {
    super(CR.SIX.log().divide(CR.valueOf(15).log()));
  }
}
