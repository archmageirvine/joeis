package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383759 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A383759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383759() {
    super(1, CR.PI.divide(18).cos().multiply(2).multiply(CR.THREE.sqrt()).subtract(1));
  }
}
