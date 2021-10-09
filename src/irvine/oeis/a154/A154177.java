package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154177 Decimal expansion of log_5 (11).
 * @author Sean A. Irvine
 */
public class A154177 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154177() {
    super(CR.valueOf(11).log().divide(CR.FIVE.log()));
  }
}
