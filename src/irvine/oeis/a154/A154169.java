package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154169 Decimal expansion of log_19 (10).
 * @author Sean A. Irvine
 */
public class A154169 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154169() {
    super(CR.TEN.log().divide(CR.valueOf(19).log()));
  }
}
