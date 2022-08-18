package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004547 Expansion of sqrt(3) in base 2.
 * @author Sean A. Irvine
 */
public class A004547 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004547() {
    super(1, CR.THREE.sqrt(), 2);
  }
}
