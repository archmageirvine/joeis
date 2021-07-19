package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154903 Decimal expansion of log_23 (17).
 * @author Sean A. Irvine
 */
public class A154903 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154903() {
    super(CR.valueOf(17).log().divide(CR.valueOf(23).log()));
  }
}
