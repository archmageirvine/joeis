package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A073248 Squarefree numbers k such that k+1 is also squarefree, but k-1 and k+2 are not.
 * @author Sean A. Irvine
 */
public class A073248 extends FilterSequence {

  /** Construct the sequence. */
  public A073248() {
    super(1, new A005117(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1))
      && Predicates.SQUARE_FREE.is(k.add(1))
      && !Predicates.SQUARE_FREE.is(k.add(2)));
  }
}
