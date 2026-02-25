package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393361 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393361() {
    super(0, CR.SQRT_PI.multiply(CR.SEVEN.subtract(CR.valueOf(40).sqrt())).divide(60));
  }
}
