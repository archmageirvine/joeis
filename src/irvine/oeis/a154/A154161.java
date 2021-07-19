package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154161 Decimal expansion of log_11 (10).
 * @author Sean A. Irvine
 */
public class A154161 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154161() {
    super(CR.TEN.log().divide(CR.valueOf(11).log()));
  }
}
