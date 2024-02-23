package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154182 Decimal expansion of log_10 (11).
 * @author Sean A. Irvine
 */
public class A154182 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154182() {
    super(CR.valueOf(11).log().divide(CR.LOG10));
  }
}
