package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a025.A025475;

/**
 * A074852 Composite n such that n and n+2 are prime powers.
 * @author Sean A. Irvine
 */
public class A074852 extends FilterSequence {

  /** Construct the sequence. */
  public A074852() {
    super(1, new A025475().skip(), k -> Predicates.PRIME_POWER.is(k.add(2)));
  }
}
