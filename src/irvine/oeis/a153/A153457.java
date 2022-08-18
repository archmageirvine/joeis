package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153457 Decimal expansion of log_23 (5).
 * @author Sean A. Irvine
 */
public class A153457 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153457() {
    super(0, CR.FIVE.log().divide(CR.valueOf(23).log()));
  }
}
