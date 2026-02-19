package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393427 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393427 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393427() {
    super(0, CR.LOG2.multiply(20).divide(81).add(new Q(2, 27)));
  }
}
