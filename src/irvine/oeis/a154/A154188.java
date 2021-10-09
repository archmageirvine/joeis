package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154188 Decimal expansion of log_17 (11).
 * @author Sean A. Irvine
 */
public class A154188 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154188() {
    super(CR.valueOf(11).log().divide(CR.valueOf(17).log()));
  }
}
