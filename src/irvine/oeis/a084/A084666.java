package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a087.A087097;

/**
 * A084666 Lunar primes that are also rational primes.
 * @author Sean A. Irvine
 */
public class A084666 extends FilterSequence {

  /** Construct the sequence. */
  public A084666() {
    super(1, new A087097(), PRIME);
  }
}
