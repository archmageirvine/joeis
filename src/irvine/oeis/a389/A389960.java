package irvine.oeis.a389;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a246.A246547;

/**
 * A389960 Powers p^m, with prime p and m &gt; 1, such that neither p^m-1 nor p^m+1 are squarefree.
 * @author Sean A. Irvine
 */
public class A389960 extends FilterSequence {

  /** Construct the sequence. */
  public A389960() {
    super(1, new A246547(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1)) && !Predicates.SQUARE_FREE.is(k.add(1)));
  }
}

