package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154210 Decimal expansion of log_18 (12).
 * @author Sean A. Irvine
 */
public class A154210 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154210() {
    super(CR.valueOf(12).log().divide(CR.valueOf(18).log()));
  }
}
