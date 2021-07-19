package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154801 Decimal expansion of log_11 (16).
 * @author Sean A. Irvine
 */
public class A154801 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154801() {
    super(CR.valueOf(16).log().divide(CR.valueOf(11).log()));
  }
}
