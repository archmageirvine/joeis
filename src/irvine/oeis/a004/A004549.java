package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004549 Expansion of sqrt(3) in base 4.
 * @author Sean A. Irvine
 */
public class A004549 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004549() {
    super(1, CR.THREE.sqrt(), 4);
  }
}
