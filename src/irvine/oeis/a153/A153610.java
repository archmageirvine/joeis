package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153610 Decimal expansion of log_20 (6).
 * @author Sean A. Irvine
 */
public class A153610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153610() {
    super(0, CR.SIX.log().divide(CR.valueOf(20).log()));
  }
}
