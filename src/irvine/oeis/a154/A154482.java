package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154482 Decimal expansion of log_15 (14).
 * @author Sean A. Irvine
 */
public class A154482 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154482() {
    super(CR.valueOf(14).log().divide(CR.valueOf(15).log()));
  }
}
