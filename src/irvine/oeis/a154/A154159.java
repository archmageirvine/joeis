package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154159 Decimal expansion of log_8 (10).
 * @author Sean A. Irvine
 */
public class A154159 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154159() {
    super(CR.TEN.log().divide(CR.EIGHT.log()));
  }
}
