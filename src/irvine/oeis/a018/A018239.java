package irvine.oeis.a018;

import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006862;

/**
 * A018239 Primorial primes: primes of the form 1 + product of first k primes, for some k.
 * @author Sean A. Irvine
 */
public class A018239 extends FilterSequence {

  /** Construct the sequence. */
  public A018239() {
    super(1, new A006862(), PRIME);
  }
}

