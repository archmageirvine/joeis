package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A073251 Numbers k such that k, k+1 and k+2 are nonprime and squarefree.
 * @author Sean A. Irvine
 */
public class A073251 extends FilterSequence {

  /** Construct the sequence. */
  public A073251() {
    super(1, new A005117(), k -> !k.isProbablePrime()
      && !k.add(1).isProbablePrime()
      && !Predicates.SQUARE_FREE.is(k.add(2))
      && !k.add(1).isProbablePrime()
      && !Predicates.SQUARE_FREE.is(k.add(2)));
  }
}

