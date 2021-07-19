package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154974 Decimal expansion of log_17 (18).
 * @author Sean A. Irvine
 */
public class A154974 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154974() {
    super(CR.valueOf(18).log().divide(CR.valueOf(17).log()));
  }
}
