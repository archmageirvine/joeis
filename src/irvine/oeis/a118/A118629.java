package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118629 Number of n-digit integers with decimal digits in increasing order.
 * @author Georg Fischer
 */
public class A118629 extends FiniteSequence {

  /** Construct the sequence. */
  public A118629() {
    super(1, FINITE, 10, 36, 84, 126, 126, 84, 36, 9, 1);
  }
}
