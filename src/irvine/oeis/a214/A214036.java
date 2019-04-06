package irvine.oeis.a214;

import irvine.oeis.FiniteSequence;

/**
 * A214036 Numbers n such that floor(sqrt(1)) + floor(sqrt(2)) + floor(sqrt(3)) + ... + floor(sqrt(n)) is prime.
 * @author Georg Fischer
 */
public class A214036 extends FiniteSequence {

  /** Construct the sequence. */
  public A214036() {
    super(2, 3, 4, 5, 7, 8, 10, 14, 36, 37, 39, 42, 43, 44, 46, 47);
  }
}
