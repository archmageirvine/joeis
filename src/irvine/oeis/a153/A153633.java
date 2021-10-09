package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153633 Decimal expansion of log_22 (7).
 * @author Sean A. Irvine
 */
public class A153633 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153633() {
    super(CR.SEVEN.log().divide(CR.valueOf(22).log()));
  }
}
