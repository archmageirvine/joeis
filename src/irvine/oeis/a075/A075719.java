package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A075719 1+n+n^s is a prime, s=10.
 * @author Sean A. Irvine
 */
public class A075719 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A075719() {
    super(1, 1, n -> Predicates.PRIME.is(Z.valueOf(n).pow(10).add(n + 1)));
  }
}
