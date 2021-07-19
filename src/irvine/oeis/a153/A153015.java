package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153015 Decimal expansion of log_12 (3).
 * @author Sean A. Irvine
 */
public class A153015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153015() {
    super(CR.THREE.log().divide(CR.valueOf(12).log()));
  }
}
