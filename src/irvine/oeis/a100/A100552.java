package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100552 Single-digit primes, followed recursively by 2k-digit primes obtained by concatenation of pairs of distinct k-digit primes of the sequence.
 * @author Georg Fischer
 */
public class A100552 extends FiniteSequence {

  /** Construct the sequence. */
  public A100552() {
    super(2, 3, 5, 7, 23, 37, 53, 73, 5323);
  }
}
