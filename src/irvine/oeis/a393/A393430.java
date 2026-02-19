package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393430 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393430 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393430() {
    super(0, CR.valueOf(Q.ONE_QUARTER).subtract(CR.valueOf(20).divide(CR.PI.square().multiply(9))));
  }
}
