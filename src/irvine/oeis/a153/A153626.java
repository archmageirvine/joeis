package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153626 Decimal expansion of log_16 (7).
 * @author Sean A. Irvine
 */
public class A153626 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153626() {
    super(CR.SEVEN.log().divide(CR.valueOf(16).log()));
  }
}
