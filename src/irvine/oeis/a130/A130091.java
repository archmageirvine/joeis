package irvine.oeis.a130;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A130091 Numbers having in their canonical prime factorization mutually distinct exponents.
 * @author Sean A. Irvine
 */
public class A130091 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A130091() {
    super(1, Predicates.DISTINCT_EXPONENTS::is);
  }
}
