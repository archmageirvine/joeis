package irvine.oeis.a102;

import irvine.oeis.Sequence;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A102151 Iccanobirt primes (1 of 15): Prime numbers in A102111.
 * @author Georg Fischer
 */
public class A102151 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A102151() {
    super(new A102111());
  }

  /**
   * Generic constructor with parameters
   * @param seq
   */
  public A102151(final Sequence seq) {
    super(seq);
  }
}
