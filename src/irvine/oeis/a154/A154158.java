package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154158 Decimal expansion of log_7(10).
 * @author Sean A. Irvine
 */
public class A154158 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154158() {
    super(CR.TEN.log().divide(CR.SEVEN.log()));
  }
}
