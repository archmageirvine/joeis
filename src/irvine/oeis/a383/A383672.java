package irvine.oeis.a383;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A383672 Squarefree numbers k such that k^2+1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A383672 extends FilterSequence {

  /** Construct the sequence. */
  public A383672() {
    super(1, new A005117(), k -> !Predicates.SQUARE_FREE.is(k.square().add(1)));
  }
}

