package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a369.A369361;

/**
 * A387919 Numbers k that are neither squarefree, nor squareful, nor a product of primorials.
 * @author Sean A. Irvine
 */
public class A387919 extends FilterSequence {

  /** Construct the sequence. */
  public A387919() {
    super(1, new A369361(), k -> !Predicates.SQUAREFUL.is(k) && !Predicates.SQUARE_FREE.is(k));
  }
}

