package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393358 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393358 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393358() {
    super(1, CR.valueOf(new Q(5, 2)).sqrt().add(new Q(5, 2)).sqrt());
  }
}
