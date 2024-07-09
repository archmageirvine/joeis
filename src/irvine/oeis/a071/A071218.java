package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071218 Numbers k such that the largest prime factor of the sum of the two consecutive primes prime(k) + prime(k+1) is at most k.
 * @author Sean A. Irvine
 */
public class A071218 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071218() {
    super(1, 1, new A071216(), (n, k) -> k.compareTo(n) <= 0);
  }
}
