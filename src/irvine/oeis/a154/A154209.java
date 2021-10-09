package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154209 Decimal expansion of log_17 (12).
 * @author Sean A. Irvine
 */
public class A154209 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154209() {
    super(CR.valueOf(12).log().divide(CR.valueOf(17).log()));
  }
}
