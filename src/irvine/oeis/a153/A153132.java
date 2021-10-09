package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153132 Decimal expansion of log_22 (4).
 * @author Sean A. Irvine
 */
public class A153132 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153132() {
    super(CR.FOUR.log().divide(CR.valueOf(22).log()));
  }
}
