package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152945 Decimal expansion of log_7(3).
 * @author Sean A. Irvine
 */
public class A152945 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152945() {
    super(0, CR.THREE.log().divide(CR.SEVEN.log()));
  }
}
