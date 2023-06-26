package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272382 Primes p == 1 (mod 3) for which A261029(14*p) = 3.
 * @author Georg Fischer
 */
public class A272382 extends FiniteSequence {

  /** Construct the sequence. */
  public A272382() {
    super(1, FINITE, 13, 19, 31, 37, 43, 61, 67, 97, 157);
  }
}
