package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154861 Decimal expansion of log_11 (17).
 * @author Sean A. Irvine
 */
public class A154861 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154861() {
    super(CR.valueOf(17).log().divide(CR.valueOf(11).log()));
  }
}
