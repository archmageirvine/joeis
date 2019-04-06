package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126250 Numbers n such that the sum of the first n factorials of primes is either a power of 2 or a prime times a power of 2.
 * @author Georg Fischer
 */
public class A126250 extends FiniteSequence {

  /** Construct the sequence. */
  public A126250() {
    super(1, 2, 3, 5, 6, 16, 27);
  }
}
