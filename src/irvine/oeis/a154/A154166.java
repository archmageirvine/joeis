package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154166 Decimal expansion of log_16 (10).
 * @author Sean A. Irvine
 */
public class A154166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154166() {
    super(CR.TEN.log().divide(CR.valueOf(16).log()));
  }
}
