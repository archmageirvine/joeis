package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154187 Decimal expansion of log_16 (11).
 * @author Sean A. Irvine
 */
public class A154187 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154187() {
    super(CR.valueOf(11).log().divide(CR.valueOf(16).log()));
  }
}
