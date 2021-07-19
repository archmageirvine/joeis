package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154017 Decimal expansion of log_18 (9).
 * @author Sean A. Irvine
 */
public class A154017 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154017() {
    super(CR.NINE.log().divide(CR.valueOf(18).log()));
  }
}
