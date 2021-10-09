package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094148 Decimal expansion of log(3)/log(4).
 * @author Sean A. Irvine
 */
public class A094148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A094148() {
    super(CR.THREE.log().divide(CR.FOUR.log()));
  }
}
