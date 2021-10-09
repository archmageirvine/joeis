package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154838 Decimal expansion of log_20 (16).
 * @author Sean A. Irvine
 */
public class A154838 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154838() {
    super(CR.valueOf(16).log().divide(CR.valueOf(20).log()));
  }
}
