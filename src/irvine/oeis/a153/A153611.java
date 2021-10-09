package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153611 Decimal expansion of log_21 (6).
 * @author Sean A. Irvine
 */
public class A153611 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153611() {
    super(CR.SIX.log().divide(CR.valueOf(21).log()));
  }
}
