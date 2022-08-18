package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153203 Decimal expansion of log_7(5).
 * @author Sean A. Irvine
 */
public class A153203 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153203() {
    super(0, CR.FIVE.log().divide(CR.SEVEN.log()));
  }
}
