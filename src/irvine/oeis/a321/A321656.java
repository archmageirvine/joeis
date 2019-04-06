package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321656 Fibonacci numbers with distinct digits.
 * @author Georg Fischer
 */
public class A321656 extends FiniteSequence {

  /** Construct the sequence. */
  public A321656() {
    super(0, 1, 2, 3, 5, 8, 13, 21, 34, 89, 610, 987, 1597, 2584, 10946, 28657, 2178309);
  }
}
