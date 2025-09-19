package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001157;

/**
 * A080402 Numbers k such that the sum of the squares of the divisors of k (A001157(k)) is not squarefree.
 * @author Sean A. Irvine
 */
public class A080402 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080402() {
    super(1, new A001157(), k -> !Predicates.SQUARE_FREE.is(k));
  }
}
