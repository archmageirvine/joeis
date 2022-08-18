package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153430 Decimal expansion of log_17 (5).
 * @author Sean A. Irvine
 */
public class A153430 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153430() {
    super(0, CR.FIVE.log().divide(CR.valueOf(17).log()));
  }
}
