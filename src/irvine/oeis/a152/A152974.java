package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152974 Decimal expansion of log_11 (3).
 * @author Sean A. Irvine
 */
public class A152974 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152974() {
    super(CR.THREE.log().divide(CR.valueOf(11).log()));
  }
}
