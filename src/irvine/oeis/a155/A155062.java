package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155062 Decimal expansion of log_10 (19).
 * @author Sean A. Irvine
 */
public class A155062 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155062() {
    super(CR.valueOf(19).log().divide(CR.TEN.log()));
  }
}
