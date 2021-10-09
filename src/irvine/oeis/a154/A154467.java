package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154467 Decimal expansion of log_7(14).
 * @author Sean A. Irvine
 */
public class A154467 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154467() {
    super(CR.valueOf(14).log().divide(CR.SEVEN.log()));
  }
}
