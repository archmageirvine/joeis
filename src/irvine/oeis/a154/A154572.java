package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154572 Decimal expansion of log_7(15).
 * @author Sean A. Irvine
 */
public class A154572 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154572() {
    super(CR.valueOf(15).log().divide(CR.SEVEN.log()));
  }
}
