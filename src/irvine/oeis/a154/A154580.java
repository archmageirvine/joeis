package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154580 Decimal expansion of log_10 (15).
 * @author Sean A. Irvine
 */
public class A154580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154580() {
    super(CR.valueOf(15).log().divide(CR.TEN.log()));
  }
}
