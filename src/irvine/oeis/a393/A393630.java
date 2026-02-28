package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393630 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A393630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393630() {
    super(1, CR.PI.multiply(ComputableReals.SINGLETON.atan(CR.E.inverse())));
  }
}
