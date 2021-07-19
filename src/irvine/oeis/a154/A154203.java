package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154203 Decimal expansion of log_10 (12).
 * @author Sean A. Irvine
 */
public class A154203 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154203() {
    super(CR.valueOf(12).log().divide(CR.TEN.log()));
  }
}
