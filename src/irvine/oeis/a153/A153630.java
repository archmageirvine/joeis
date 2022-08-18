package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153630 Decimal expansion of log_20 (7).
 * @author Sean A. Irvine
 */
public class A153630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153630() {
    super(0, CR.SEVEN.log().divide(CR.valueOf(20).log()));
  }
}
