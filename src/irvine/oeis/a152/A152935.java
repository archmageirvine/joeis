package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152935 Decimal expansion of log_6 (3).
 * @author Sean A. Irvine
 */
public class A152935 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152935() {
    super(CR.THREE.log().divide(CR.SIX.log()));
  }
}
