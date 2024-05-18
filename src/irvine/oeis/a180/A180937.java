package irvine.oeis.a180;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000203;

/**
 * A180937 Sigma-decagonal numbers: numbers n such that sigma(n) is a decagonal number, that is, sigma(n)=4*m^2-3m for some nonnegative integer m.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A180937 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A180937() {
    super(1, 1, new A000203(), v -> Predicates.POLYGONAL.is(10, v));
  }
}
