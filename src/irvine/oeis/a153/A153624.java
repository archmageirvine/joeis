package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153624 Decimal expansion of log_14 (7).
 * @author Sean A. Irvine
 */
public class A153624 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153624() {
    super(CR.SEVEN.log().divide(CR.valueOf(14).log()));
  }
}
