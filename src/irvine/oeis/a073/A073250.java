package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A073171.
 * @author Sean A. Irvine
 */
public class A073250 extends FilterSequence {

  /** Construct the sequence. */
  public A073250() {
    super(1, new A005117(), k -> !k.isProbablePrime()
      && !k.add(1).isProbablePrime()
      && Predicates.SQUARE_FREE.is(k.add(1))
      && (k.subtract(1).isProbablePrime() || !Predicates.SQUARE_FREE.is(k.subtract(1)))
      && (k.add(2).isProbablePrime() || !Predicates.SQUARE_FREE.is(k.add(2))));
  }
}

