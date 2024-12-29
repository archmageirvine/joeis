package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000720;

/**
 * A073929.
 * @author Sean A. Irvine
 */
public class A073945 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073945() {
    super(1, 0, new PrependSequence(new A000720(), 0), (n, k) -> Predicates.SQUARE.is(k.add(n)));
  }
}

