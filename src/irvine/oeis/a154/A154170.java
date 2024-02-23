package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154170 Decimal expansion of log_20 (10).
 * @author Sean A. Irvine
 */
public class A154170 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154170() {
    super(0, CR.LOG10.divide(CR.valueOf(20).log()));
  }
}
