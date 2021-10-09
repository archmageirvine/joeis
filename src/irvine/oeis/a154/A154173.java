package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154173 Decimal expansion of log_23 (10).
 * @author Sean A. Irvine
 */
public class A154173 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154173() {
    super(CR.TEN.log().divide(CR.valueOf(23).log()));
  }
}
