package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154206 Decimal expansion of log_14 (12).
 * @author Sean A. Irvine
 */
public class A154206 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154206() {
    super(0, CR.valueOf(12).log().divide(CR.valueOf(14).log()));
  }
}
