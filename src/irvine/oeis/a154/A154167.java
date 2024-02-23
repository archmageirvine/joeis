package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154167 Decimal expansion of log_17 (10).
 * @author Sean A. Irvine
 */
public class A154167 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154167() {
    super(0, CR.LOG10.divide(CR.valueOf(17).log()));
  }
}
