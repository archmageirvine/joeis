package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154165 Decimal expansion of log_15 (10).
 * @author Sean A. Irvine
 */
public class A154165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154165() {
    super(CR.TEN.log().divide(CR.valueOf(15).log()));
  }
}
