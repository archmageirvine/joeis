package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A085706 Squarefree numbers sandwiched between two brilliant numbers.
 * @author Sean A. Irvine
 */
public class A085706 extends FilterSequence {

  /** Construct the sequence. */
  public A085706() {
    super(1, new A005117(), k -> Predicates.BRILLIANT.is(k.subtract(1)) && Predicates.BRILLIANT.is(k.add(1)));
  }
}
