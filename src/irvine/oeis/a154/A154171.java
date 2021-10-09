package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154171 Decimal expansion of log_21 (10).
 * @author Sean A. Irvine
 */
public class A154171 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154171() {
    super(CR.TEN.log().divide(CR.valueOf(21).log()));
  }
}
