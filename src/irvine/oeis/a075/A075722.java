package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A075719.
 * @author Sean A. Irvine
 */
public class A075722 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A075722() {
    super(1, 1, n -> Predicates.PRIME.is(Z.valueOf(n).pow(7).add(n + 1)));
  }
}
