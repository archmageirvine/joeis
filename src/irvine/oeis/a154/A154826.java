package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154826 Decimal expansion of log_15 (16).
 * @author Sean A. Irvine
 */
public class A154826 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154826() {
    super(CR.valueOf(16).log().divide(CR.valueOf(15).log()));
  }
}
