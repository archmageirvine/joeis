package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153619 Decimal expansion of log_9 (7).
 * @author Sean A. Irvine
 */
public class A153619 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153619() {
    super(0, CR.SEVEN.log().divide(CR.NINE.log()));
  }
}
