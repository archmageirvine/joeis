package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154466 Decimal expansion of log_6 (14).
 * @author Sean A. Irvine
 */
public class A154466 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154466() {
    super(CR.valueOf(14).log().divide(CR.SIX.log()));
  }
}
