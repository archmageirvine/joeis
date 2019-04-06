package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059277 1^36, 2^25, 3^16, 4^9, 5^4, 6^1, 7^0.
 * @author Georg Fischer
 */
public class A059277 extends FiniteSequence {

  /** Construct the sequence. */
  public A059277() {
    super(1, 33554432, 43046721, 162144, 625, 6, 1);
  }
}
