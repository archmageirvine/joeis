package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154830 Decimal expansion of log_18 (16).
 * @author Sean A. Irvine
 */
public class A154830 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154830() {
    super(CR.valueOf(16).log().divide(CR.valueOf(18).log()));
  }
}
