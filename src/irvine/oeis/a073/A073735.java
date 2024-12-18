package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;

/**
 * A073735 Numbers k such that the k-th term of the EKG sequence (A064413(k)) has more than one controlling prime.
 * @author Sean A. Irvine
 */
public class A073735 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073735() {
    super(1, 3, new A073734().skip(), k -> !Predicates.PRIME_POWER.is(k));
  }
}

