package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073473 Primes (including 1) forming 3 X 3 magic square with prime entries and minimal constant 111 = A073502(3).
 * @author Georg Fischer
 */
public class A073473 extends FiniteSequence {

  /** Construct the sequence. */
  public A073473() {
    super(1, FINITE, 1, 7, 13, 31, 37, 43, 61, 67, 73);
  }
}
