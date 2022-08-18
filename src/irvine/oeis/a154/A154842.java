package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154842 Decimal expansion of log_22 (16).
 * @author Sean A. Irvine
 */
public class A154842 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154842() {
    super(0, CR.valueOf(16).log().divide(CR.valueOf(22).log()));
  }
}
