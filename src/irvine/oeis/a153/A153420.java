package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153420 Decimal expansion of log_16 (5).
 * @author Sean A. Irvine
 */
public class A153420 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153420() {
    super(CR.FIVE.log().divide(CR.valueOf(16).log()));
  }
}
