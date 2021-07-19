package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154688 Decimal expansion of log_18 (15).
 * @author Sean A. Irvine
 */
public class A154688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154688() {
    super(CR.valueOf(15).log().divide(CR.valueOf(18).log()));
  }
}
