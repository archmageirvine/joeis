package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154183 Decimal expansion of log_12 (11).
 * @author Sean A. Irvine
 */
public class A154183 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154183() {
    super(0, CR.valueOf(11).log().divide(CR.valueOf(12).log()));
  }
}
