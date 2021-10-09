package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004553 Expansion of sqrt(3) in base 8.
 * @author Sean A. Irvine
 */
public class A004553 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004553() {
    super(0, CR.THREE.sqrt(), 8);
  }
}
