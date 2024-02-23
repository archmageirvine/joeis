package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154478 Decimal expansion of log_10 (14).
 * @author Sean A. Irvine
 */
public class A154478 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154478() {
    super(CR.valueOf(14).log().divide(CR.LOG10));
  }
}
