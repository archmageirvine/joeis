package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140955 Even integers that cannot be expressed as two distinct sums of two primes.
 * @author Georg Fischer
 */
public class A140955 extends FiniteSequence {

  /** Construct the sequence. */
  public A140955() {
    super(0, 2, 4, 6, 8, 10, 12, 14, 38);
  }
}
