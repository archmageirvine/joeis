package irvine.oeis.a049;

import irvine.oeis.FiniteSequence;

/**
 * A049101 Numbers m such that m divides (product of digits of m) * (sum of digits of m).
 * @author Georg Fischer
 */
public class A049101 extends FiniteSequence {

  /** Construct the sequence. */
  public A049101() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 18, 24, 45, 48, 135, 144, 288, 378, 476, 756, 864, 1575, 39366, 69984, 139968);
  }
}
