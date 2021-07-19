package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154953 Decimal expansion of log_10 (18).
 * @author Sean A. Irvine
 */
public class A154953 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154953() {
    super(CR.valueOf(18).log().divide(CR.TEN.log()));
  }
}
