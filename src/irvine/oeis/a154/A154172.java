package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154172 Decimal expansion of log_22 (10).
 * @author Sean A. Irvine
 */
public class A154172 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154172() {
    super(CR.TEN.log().divide(CR.valueOf(22).log()));
  }
}
