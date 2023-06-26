package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053611 Numbers k such that 1 + 4 + 9 + ... + k^2 = 1 + 2 + 3 + ... + m for some m.
 * @author Georg Fischer
 */
public class A053611 extends FiniteSequence {

  /** Construct the sequence. */
  public A053611() {
    super(1, FINITE, 1, 5, 6, 85);
  }
}
