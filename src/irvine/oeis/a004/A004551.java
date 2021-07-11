package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004551 Expansion of sqrt(3) in base 2.
 * @author Sean A. Irvine
 */
public class A004551 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004551() {
    super(0, CR.THREE.sqrt(), 6);
  }
}
