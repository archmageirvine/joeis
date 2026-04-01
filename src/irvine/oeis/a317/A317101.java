package irvine.oeis.a317;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A317101 Numbers whose prime multiplicities are pairwise indivisible.
 * @author Sean A. Irvine
 */
public class A317101 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A317101() {
    super(1, Predicates.INDIVISIBLE::is);
  }
}

