package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153736 Decimal expansion of log_24(7).
 * @author Sean A. Irvine
 */
public class A153736 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153736() {
    super(CR.SEVEN.log().divide(CR.valueOf(24).log()));
  }
}
