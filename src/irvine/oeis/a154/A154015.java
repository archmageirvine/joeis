package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154015 Decimal expansion of log_15 (9).
 * @author Sean A. Irvine
 */
public class A154015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154015() {
    super(CR.NINE.log().divide(CR.valueOf(15).log()));
  }
}
