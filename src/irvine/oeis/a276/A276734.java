package irvine.oeis.a276;

import irvine.oeis.FiniteSequence;

/**
 * A276734 Numbers n such that the number of divisors of n equals the integer part of the geometric mean of the divisors of n.
 * @author Georg Fischer
 */
public class A276734 extends FiniteSequence {

  /** Construct the sequence. */
  public A276734() {
    super(1, FINITE, 1, 5, 7, 9, 21, 22, 44, 45, 66, 70, 78, 112, 150, 156, 160, 264, 270, 280, 432, 600, 1080, 1680);
  }
}
