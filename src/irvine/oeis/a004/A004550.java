package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004550 Expansion of sqrt(3) in base 5.
 * @author Sean A. Irvine
 */
public class A004550 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004550() {
    super(0, CR.THREE.sqrt(), 5);
  }
}
