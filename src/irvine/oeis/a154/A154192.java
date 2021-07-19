package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154192 Decimal expansion of log_21 (11).
 * @author Sean A. Irvine
 */
public class A154192 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154192() {
    super(CR.valueOf(11).log().divide(CR.valueOf(21).log()));
  }
}
