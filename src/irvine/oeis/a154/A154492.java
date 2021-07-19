package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154492 Decimal expansion of log_20 (14).
 * @author Sean A. Irvine
 */
public class A154492 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154492() {
    super(CR.valueOf(14).log().divide(CR.valueOf(20).log()));
  }
}
