package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154993 Decimal expansion of log_23 (18).
 * @author Sean A. Irvine
 */
public class A154993 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154993() {
    super(CR.valueOf(18).log().divide(CR.valueOf(23).log()));
  }
}
