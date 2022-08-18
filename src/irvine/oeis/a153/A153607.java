package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153607 Decimal expansion of log_17 (6).
 * @author Sean A. Irvine
 */
public class A153607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153607() {
    super(0, CR.SIX.log().divide(CR.valueOf(17).log()));
  }
}
