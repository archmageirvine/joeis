package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A075722 Numbers n such that 1 + n + n^s is a prime, s = 7.
 * @author Sean A. Irvine
 */
public class A075722 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A075722() {
    super(1, 1, n -> Predicates.PRIME.is(Z.valueOf(n).pow(7).add(n + 1)));
  }
}
