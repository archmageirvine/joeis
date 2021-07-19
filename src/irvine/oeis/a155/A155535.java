package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155535 Decimal expansion of log_24 (20).
 * @author Sean A. Irvine
 */
public class A155535 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155535() {
    super(CR.valueOf(20).log().divide(CR.valueOf(24).log()));
  }
}
