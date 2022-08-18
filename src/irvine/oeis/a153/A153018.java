package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153018 Decimal expansion of log_15 (3).
 * @author Sean A. Irvine
 */
public class A153018 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153018() {
    super(0, CR.THREE.log().divide(CR.valueOf(15).log()));
  }
}
