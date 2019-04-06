package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036371 Number of ternary rooted trees with n nodes and height at most 3.
 * @author Georg Fischer
 */
public class A036371 extends FiniteSequence {

  /** Construct the sequence. */
  public A036371() {
    super(1, 1, 1, 2, 3, 4, 4, 5, 4, 4, 3, 2, 1, 1);
  }
}
