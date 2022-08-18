package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153131 Decimal expansion of log_21 (4).
 * @author Sean A. Irvine
 */
public class A153131 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153131() {
    super(0, CR.FOUR.log().divide(CR.valueOf(21).log()));
  }
}
