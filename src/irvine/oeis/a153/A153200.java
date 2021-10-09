package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153200 Decimal expansion of log_24(4).
 * @author Sean A. Irvine
 */
public class A153200 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153200() {
    super(CR.FOUR.log().divide(CR.valueOf(24).log()));
  }
}
