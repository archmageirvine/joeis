package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153107 Decimal expansion of log_14 (4).
 * @author Sean A. Irvine
 */
public class A153107 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153107() {
    super(CR.FOUR.log().divide(CR.valueOf(14).log()));
  }
}
