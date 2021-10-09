package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154489 Decimal expansion of log_17 (14).
 * @author Sean A. Irvine
 */
public class A154489 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154489() {
    super(CR.valueOf(14).log().divide(CR.valueOf(17).log()));
  }
}
