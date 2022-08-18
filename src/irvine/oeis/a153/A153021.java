package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153021 Decimal expansion of log_18 (3).
 * @author Sean A. Irvine
 */
public class A153021 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153021() {
    super(0, CR.THREE.log().divide(CR.valueOf(18).log()));
  }
}
