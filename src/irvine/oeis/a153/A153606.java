package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153606 Decimal expansion of log_16 (6).
 * @author Sean A. Irvine
 */
public class A153606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153606() {
    super(CR.SIX.log().divide(CR.valueOf(16).log()));
  }
}
