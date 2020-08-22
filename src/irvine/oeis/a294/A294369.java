package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294369 Indices of Fibonacci numbers (A000045) that are triangular numbers (A000217).
 * @author Georg Fischer
 */
public class A294369 extends FiniteSequence {

  /** Construct the sequence. */
  public A294369() {
    super(0, 1, 2, 4, 8, 10);
  }
}
