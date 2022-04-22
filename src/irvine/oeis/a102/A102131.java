package irvine.oeis.a102;

import irvine.oeis.Sequence;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A102131 Iccanobirt prime indices (1 of 15): Indices of prime numbers in A102111.
 * @author Georg Fischer
 */
public class A102131 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A102131() {
    super(new A102111(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param seq
   */
  public A102131(final Sequence seq) {
    super(seq, 0);
  }
}
