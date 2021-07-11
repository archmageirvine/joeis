package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004554 Expansion of sqrt(3) in base 9.
 * @author Sean A. Irvine
 */
public class A004554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004554() {
    super(0, CR.THREE.sqrt(), 9);
  }
}
