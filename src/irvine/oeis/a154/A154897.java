package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154897 Decimal expansion of log_16 (17).
 * @author Sean A. Irvine
 */
public class A154897 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154897() {
    super(CR.valueOf(17).log().divide(CR.valueOf(16).log()));
  }
}
