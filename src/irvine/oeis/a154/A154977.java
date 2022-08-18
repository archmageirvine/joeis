package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154977 Decimal expansion of log_21 (18).
 * @author Sean A. Irvine
 */
public class A154977 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154977() {
    super(0, CR.valueOf(18).log().divide(CR.valueOf(21).log()));
  }
}
