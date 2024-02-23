package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154168 Decimal expansion of log_18 (10).
 * @author Sean A. Irvine
 */
public class A154168 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154168() {
    super(0, CR.LOG10.divide(CR.valueOf(18).log()));
  }
}
