package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154213 Decimal expansion of log_21 (12).
 * @author Sean A. Irvine
 */
public class A154213 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154213() {
    super(0, CR.valueOf(12).log().divide(CR.valueOf(21).log()));
  }
}
