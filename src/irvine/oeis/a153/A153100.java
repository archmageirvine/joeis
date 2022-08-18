package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153100 Decimal expansion of log_24 (3).
 * @author Sean A. Irvine
 */
public class A153100 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153100() {
    super(0, CR.THREE.log().divide(CR.valueOf(24).log()));
  }
}
