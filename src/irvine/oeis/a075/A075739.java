package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A075739 Nonsquarefree Fibonacci numbers whose indices are also not squarefree.
 * @author Sean A. Irvine
 */
public class A075739 extends FilterSequence {

  /** Construct the sequence. */
  public A075739() {
    super(1, new A000045().skip(), 1, (n, k) -> !Predicates.SQUARE_FREE.is(n) && !Predicates.SQUARE_FREE.is(k));
  }
}
