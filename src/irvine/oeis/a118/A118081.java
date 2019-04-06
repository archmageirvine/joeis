package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118081 Even numbers that can't be represented as the sum of two odd composite numbers.
 * @author Georg Fischer
 */
public class A118081 extends FiniteSequence {

  /** Construct the sequence. */
  public A118081() {
    super(2, 4, 6, 8, 10, 12, 14, 16, 20, 22, 26, 28, 32, 38);
  }
}
