package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153019 Decimal expansion of log_16 (3).
 * @author Sean A. Irvine
 */
public class A153019 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153019() {
    super(0, CR.THREE.log().divide(CR.valueOf(16).log()));
  }
}
