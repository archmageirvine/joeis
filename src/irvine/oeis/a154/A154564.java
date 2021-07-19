package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154564 Decimal expansion of log_5 (15).
 * @author Sean A. Irvine
 */
public class A154564 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154564() {
    super(CR.valueOf(15).log().divide(CR.FIVE.log()));
  }
}
