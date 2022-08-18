package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154900 Decimal expansion of log_20 (17).
 * @author Sean A. Irvine
 */
public class A154900 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154900() {
    super(0, CR.valueOf(17).log().divide(CR.valueOf(20).log()));
  }
}
