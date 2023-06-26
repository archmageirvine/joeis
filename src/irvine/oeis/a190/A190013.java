package irvine.oeis.a190;

import irvine.oeis.FiniteSequence;

/**
 * A190013 An optimal 2-radius sequence over a (2p)-element alphabet for p = 5.
 * @author Georg Fischer
 */
public class A190013 extends FiniteSequence {

  /** Construct the sequence. */
  public A190013() {
    super(1, FINITE, 0, 1, 3, 0, 2, 4, 1, 3, 0, 2, 4, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 0, 2, 2, 3, 3, 4, 4, 1, 1);
  }
}
