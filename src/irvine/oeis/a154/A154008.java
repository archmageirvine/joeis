package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154008 Decimal expansion of log_5 (9).
 * @author Sean A. Irvine
 */
public class A154008 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154008() {
    super(CR.NINE.log().divide(CR.FIVE.log()));
  }
}
