package irvine.oeis.a058;

import irvine.oeis.DistinctSequence;

/**
 * A058255 Distinct values of lcm_{i=1..n} (p(i)-1), where p() are the primes.
 * @author Sean A. Irvine
 */
public class A058255 extends DistinctSequence {

  /** Construct the sequence. */
  public A058255() {
    super(new A058254());
  }
}
