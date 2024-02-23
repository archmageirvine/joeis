package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154174 Decimal expansion of log_24(10).
 * @author Sean A. Irvine
 */
public class A154174 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154174() {
    super(0, CR.LOG10.divide(CR.valueOf(24).log()));
  }
}
