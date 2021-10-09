package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154178 Decimal expansion of log_6 (11).
 * @author Sean A. Irvine
 */
public class A154178 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154178() {
    super(CR.valueOf(11).log().divide(CR.SIX.log()));
  }
}
