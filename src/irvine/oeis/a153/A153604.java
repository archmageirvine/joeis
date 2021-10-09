package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153604 Decimal expansion of log_14 (6).
 * @author Sean A. Irvine
 */
public class A153604 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153604() {
    super(CR.SIX.log().divide(CR.valueOf(14).log()));
  }
}
