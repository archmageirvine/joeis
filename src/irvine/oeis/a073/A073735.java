package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;

/**
 * A046104.
 * @author Sean A. Irvine
 */
public class A073735 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073735() {
    super(1, 3, new A073734().skip(), k -> !Predicates.PRIME_POWER.is(k));
  }
}

