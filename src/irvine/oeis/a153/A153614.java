package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153614 Decimal expansion of log_24 (6).
 * @author Sean A. Irvine
 */
public class A153614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153614() {
    super(CR.SIX.log().divide(CR.valueOf(24).log()));
  }
}
