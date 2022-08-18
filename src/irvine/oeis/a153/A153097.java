package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153097 Decimal expansion of log_21 (3).
 * @author Sean A. Irvine
 */
public class A153097 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153097() {
    super(0, CR.THREE.log().divide(CR.valueOf(21).log()));
  }
}
