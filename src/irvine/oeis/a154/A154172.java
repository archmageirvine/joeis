package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154172 Decimal expansion of log_22 (10).
 * @author Sean A. Irvine
 */
public class A154172 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154172() {
    super(0, CR.LOG10.divide(CR.valueOf(22).log()));
  }
}
