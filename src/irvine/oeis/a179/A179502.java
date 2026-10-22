package irvine.oeis.a179;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A179502 Numbers k with the property that k^2, k^2+1 and k^2+2 are all semiprimes.
 * @author Sean A. Irvine
 */
public class A179502 extends FilterSequence {

  /** Construct the sequence. */
  public A179502() {
    super(1, new A000040(), p -> Predicates.SEMIPRIME.is(p.square().add(1)) && Predicates.SEMIPRIME.is(p.square().add(2)));
  }
}
