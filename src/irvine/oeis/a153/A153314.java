package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153314 Decimal expansion of log_14 (5).
 * @author Sean A. Irvine
 */
public class A153314 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153314() {
    super(CR.FIVE.log().divide(CR.valueOf(14).log()));
  }
}
