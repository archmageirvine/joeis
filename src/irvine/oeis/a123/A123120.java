package irvine.oeis.a123;

import irvine.oeis.FiniteSequence;

/**
 * A123120 Numbers <code>k&gt;0</code> such that m+k is not the sum of m nonzero squares for <code>any</code> m&gt;5.
 * @author Georg Fischer
 */
public class A123120 extends FiniteSequence {

  /** Construct the sequence. */
  public A123120() {
    super(1, 2, 4, 5, 7, 10, 13);
  }
}
