package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393356 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393356 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393356() {
    super(0, CR.SQRT_PI.multiply(CR.THREE.subtract(CR.SIX.sqrt()).divide(12)));
  }
}

