package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.DirectSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a013.A013929;

/**
 * A013929.
 * @author Sean A. Irvine
 */
public class A386762 extends TwoParameterFormSequence {

  private static final DirectSequence NONSQUAREFREE_NONSQUAREFUL = DirectSequence.create(new FilterSequence(new A013929(), k -> !Predicates.SQUAREFUL.is(k)));

  /** Construct the sequence. */
  public A386762() {
    super(1, 0, 2, (m, k) -> NONSQUAREFREE_NONSQUAREFUL.a(m.intValue()).pow(k));
  }
}
