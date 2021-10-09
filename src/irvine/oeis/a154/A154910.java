package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154910 Decimal expansion of log_5 (18).
 * @author Sean A. Irvine
 */
public class A154910 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154910() {
    super(CR.valueOf(18).log().divide(CR.FIVE.log()));
  }
}
