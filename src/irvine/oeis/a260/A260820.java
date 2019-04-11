package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260820 Nonnegative integers n such that <code>n^3-3</code> is divisible by <code>n-3</code>.
 * @author Georg Fischer
 */
public class A260820 extends FiniteSequence {

  /** Construct the sequence. */
  public A260820() {
    super(0, 1, 2, 4, 5, 6, 7, 9, 11, 15, 27);
  }
}
