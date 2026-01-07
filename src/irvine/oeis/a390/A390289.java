package irvine.oeis.a390;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a004.A004709;

/**
 * A390289 Cubefree numbers that are not prime powers.
 * @author Sean A. Irvine
 */
public class A390289 extends FilterSequence {

  /** Construct the sequence. */
  public A390289() {
    super(new A004709().skip(), k -> !Predicates.PRIME_POWER.is(k));
  }
}
