package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153020 Decimal expansion of log_17 (3).
 * @author Sean A. Irvine
 */
public class A153020 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153020() {
    super(CR.THREE.log().divide(CR.valueOf(17).log()));
  }
}
