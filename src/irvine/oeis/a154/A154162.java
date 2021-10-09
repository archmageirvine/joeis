package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154162 Decimal expansion of log_12 (10).
 * @author Sean A. Irvine
 */
public class A154162 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154162() {
    super(CR.TEN.log().divide(CR.valueOf(12).log()));
  }
}
