package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154460 Decimal expansion of log_23 (13).
 * @author Sean A. Irvine
 */
public class A154460 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154460() {
    super(CR.valueOf(13).log().divide(CR.valueOf(23).log()));
  }
}
