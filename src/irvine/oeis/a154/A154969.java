package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154969 Decimal expansion of log_12 (18).
 * @author Sean A. Irvine
 */
public class A154969 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154969() {
    super(CR.valueOf(18).log().divide(CR.valueOf(12).log()));
  }
}
