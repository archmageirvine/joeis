package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154195 Decimal expansion of log_24 (11).
 * @author Sean A. Irvine
 */
public class A154195 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154195() {
    super(CR.valueOf(11).log().divide(CR.valueOf(24).log()));
  }
}
