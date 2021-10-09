package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154019 Decimal expansion of log_20 (9).
 * @author Sean A. Irvine
 */
public class A154019 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154019() {
    super(CR.NINE.log().divide(CR.valueOf(20).log()));
  }
}
