package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A069977 Numbers k such that k and k+2 are squarefree.
 * @author Sean A. Irvine
 */
public class A069977 extends FilterSequence {

  /** Construct the sequence. */
  public A069977() {
    super(1, new A005117(), k -> Predicates.SQUARE_FREE.is(k.add(2)));
  }
}

