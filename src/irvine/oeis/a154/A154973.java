package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154973 Decimal expansion of log_16 (18).
 * @author Sean A. Irvine
 */
public class A154973 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154973() {
    super(CR.valueOf(18).log().divide(CR.valueOf(16).log()));
  }
}
