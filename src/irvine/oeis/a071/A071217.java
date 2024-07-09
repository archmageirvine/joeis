package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071217 Numbers k such that the largest prime factor of the sum of successive primes p(k) + p(k+1) is greater than k.
 * @author Sean A. Irvine
 */
public class A071217 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071217() {
    super(1, 1, new A071216(), (n, k) -> k.compareTo(n) > 0);
  }
}
