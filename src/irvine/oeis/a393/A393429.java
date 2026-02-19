package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393429 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393429 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393429() {
    super(0, CR.valueOf(new Q(2, 9)).subtract(CR.FIVE.divide(CR.PI.square().multiply(18))));
  }
}
