package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a393.A393708;

/**
 * A394050 Achilles numbers with more than 2 distinct prime factors, whose exponents that are all pairwise indivisible.
 * @author Sean A. Irvine
 */
public class A394050 extends FilterSequence {

  /** Construct the sequence. */
  public A394050() {
    super(1, new A393708(), Predicates.INDIVISIBLE::is);
  }
}

