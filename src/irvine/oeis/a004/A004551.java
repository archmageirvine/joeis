package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004551 Expansion of sqrt(3) in base 6.
 * @author Sean A. Irvine
 */
public class A004551 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004551() {
    super(1, CR.THREE.sqrt(), 6);
  }
}
