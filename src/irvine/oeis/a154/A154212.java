package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154212 Decimal expansion of log_20 (12).
 * @author Sean A. Irvine
 */
public class A154212 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154212() {
    super(CR.valueOf(12).log().divide(CR.valueOf(20).log()));
  }
}
