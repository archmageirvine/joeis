package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154156 Decimal expansion of log_5 (10).
 * @author Sean A. Irvine
 */
public class A154156 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154156() {
    super(CR.TEN.log().divide(CR.FIVE.log()));
  }
}
