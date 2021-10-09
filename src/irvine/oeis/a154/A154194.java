package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154194 Decimal expansion of log_23 (11).
 * @author Sean A. Irvine
 */
public class A154194 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154194() {
    super(CR.valueOf(11).log().divide(CR.valueOf(23).log()));
  }
}
