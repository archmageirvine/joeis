package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153313 Decimal expansion of log_13 (5).
 * @author Sean A. Irvine
 */
public class A153313 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153313() {
    super(CR.FIVE.log().divide(CR.valueOf(13).log()));
  }
}
