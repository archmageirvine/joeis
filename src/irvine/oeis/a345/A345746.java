package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345746 allocated for Angad Singh.
 * @author Sean A. Irvine
 */
public class A345746 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345746() {
    super(CR.PI.pow(CR.valueOf(new Q(-1, 9))));
  }
}
