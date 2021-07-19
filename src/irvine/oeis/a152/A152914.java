package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152914 Decimal expansion of log_5 (3).
 * @author Sean A. Irvine
 */
public class A152914 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152914() {
    super(CR.THREE.log().divide(CR.FIVE.log()));
  }
}
