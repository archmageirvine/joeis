package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154207 Decimal expansion of log_15 (12).
 * @author Sean A. Irvine
 */
public class A154207 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154207() {
    super(CR.valueOf(12).log().divide(CR.valueOf(15).log()));
  }
}
