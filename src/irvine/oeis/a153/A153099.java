package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153099 Decimal expansion of log_23 (3).
 * @author Sean A. Irvine
 */
public class A153099 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153099() {
    super(0, CR.THREE.log().divide(CR.valueOf(23).log()));
  }
}
