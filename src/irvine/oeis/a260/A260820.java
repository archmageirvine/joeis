package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260820 Nonnegative integers n such that n^3-3 is divisible by n-3.
 * @author Georg Fischer
 */
public class A260820 extends FiniteSequence {

  /** Construct the sequence. */
  public A260820() {
    super(0, 1, 2, 4, 5, 6, 7, 9, 11, 15, 27);
  }
}
