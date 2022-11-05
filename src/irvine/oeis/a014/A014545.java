package irvine.oeis.a014;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006862;

/**
 * A014545 Primorial plus 1 prime indices: n such that n-th Euclid number A006862(n) = 1 + (Product of first n primes) is prime.
 * @author Sean A. Irvine
 */
public class A014545 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A014545() {
    super(0, new A006862(), PRIME);
  }
}
