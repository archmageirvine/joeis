package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392017 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A392017 extends DecimalExpansionSequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A392017() {
    super(1, SQRT3.add(2).log().multiply(SQRT3));
  }
}
