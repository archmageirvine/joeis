package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153017 Decimal expansion of log_14 (3).
 * @author Sean A. Irvine
 */
public class A153017 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153017() {
    super(CR.THREE.log().divide(CR.valueOf(14).log()));
  }
}
