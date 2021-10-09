package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154160 Decimal expansion of log_9 (10).
 * @author Sean A. Irvine
 */
public class A154160 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154160() {
    super(CR.TEN.log().divide(CR.NINE.log()));
  }
}
