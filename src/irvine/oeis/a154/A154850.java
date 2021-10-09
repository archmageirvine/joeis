package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154850 Decimal expansion of log_5 (17).
 * @author Sean A. Irvine
 */
public class A154850 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154850() {
    super(CR.valueOf(17).log().divide(CR.FIVE.log()));
  }
}
