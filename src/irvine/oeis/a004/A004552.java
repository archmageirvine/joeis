package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004552 Expansion of sqrt(3) in base 7.
 * @author Sean A. Irvine
 */
public class A004552 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004552() {
    super(0, CR.THREE.sqrt(), 7);
  }
}
