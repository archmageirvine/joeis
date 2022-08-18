package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004550 Expansion of sqrt(3) in base 5.
 * @author Sean A. Irvine
 */
public class A004550 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004550() {
    super(1, CR.THREE.sqrt(), 5);
  }
}
