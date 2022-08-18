package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004548 Expansion of sqrt(3) in base 3.
 * @author Sean A. Irvine
 */
public class A004548 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004548() {
    super(1, CR.THREE.sqrt(), 3);
  }
}
