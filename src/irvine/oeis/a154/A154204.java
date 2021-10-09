package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154204 Decimal expansion of log_11 (12).
 * @author Sean A. Irvine
 */
public class A154204 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154204() {
    super(CR.valueOf(12).log().divide(CR.valueOf(11).log()));
  }
}
