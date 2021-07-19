package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154947 Decimal expansion of log_9 (18).
 * @author Sean A. Irvine
 */
public class A154947 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154947() {
    super(CR.valueOf(18).log().divide(CR.NINE.log()));
  }
}
