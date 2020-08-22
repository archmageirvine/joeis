package irvine.oeis.a123;

import irvine.oeis.FiniteSequence;

/**
 * A123120 Numbers k&gt;0 such that m+k is not the sum of m nonzero squares for any m&gt;5.
 * @author Georg Fischer
 */
public class A123120 extends FiniteSequence {

  /** Construct the sequence. */
  public A123120() {
    super(1, 2, 4, 5, 7, 10, 13);
  }
}
