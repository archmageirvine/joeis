package irvine.oeis.a114;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A114493 Decimal expansion of log_10(4).
 * @author Sean A. Irvine
 */
public class A114493 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A114493() {
    super(0, CR.FOUR.log().divide(CR.LOG10));
  }
}
