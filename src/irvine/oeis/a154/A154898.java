package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154898 Decimal expansion of log_18 (17).
 * @author Sean A. Irvine
 */
public class A154898 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154898() {
    super(0, CR.valueOf(17).log().divide(CR.valueOf(18).log()));
  }
}
