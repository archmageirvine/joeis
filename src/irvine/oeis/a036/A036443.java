package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036443 Number of ternary rooted trees with n nodes and height exactly 3.
 * @author Georg Fischer
 */
public class A036443 extends FiniteSequence {

  /** Construct the sequence. */
  public A036443() {
    super(0, 0, 0, 1, 2, 4, 4, 5, 4, 4, 3, 2, 1, 1);
  }
}
