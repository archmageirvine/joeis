package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152956 Decimal expansion of log_8 (3).
 * @author Sean A. Irvine
 */
public class A152956 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152956() {
    super(CR.THREE.log().divide(CR.EIGHT.log()));
  }
}
