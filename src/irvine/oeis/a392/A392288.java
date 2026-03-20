package irvine.oeis.a392;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a130.A130092;

/**
 * A392288 Nonsquarefree numbers whose canonical prime factorization has at least two prime power factors with equal exponents.
 * @author Sean A. Irvine
 */
public class A392288 extends FilterSequence {

  /** Construct the sequence. */
  public A392288() {
    super(1, new A130092(), k -> !Predicates.SQUARE_FREE.is(k));
  }
}
