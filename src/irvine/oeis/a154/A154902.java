package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154902 Decimal expansion of log_22 (17).
 * @author Sean A. Irvine
 */
public class A154902 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154902() {
    super(CR.valueOf(17).log().divide(CR.valueOf(22).log()));
  }
}
