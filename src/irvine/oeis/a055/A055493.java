package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055493 Numbers n such that Sum_{k=1..n} k! - 2 is prime.
 * @author Georg Fischer
 */
public class A055493 extends FiniteSequence {

  /** Construct the sequence. */
  public A055493() {
    super(1, FINITE, 3, 4, 5, 12, 13, 19, 65, 90, 123, 211, 281, 459);
  }
}
