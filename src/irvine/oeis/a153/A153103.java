package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153103 Decimal expansion of log_7 (4).
 * @author Sean A. Irvine
 */
public class A153103 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153103() {
    super(CR.FOUR.log().divide(CR.SEVEN.log()));
  }
}
