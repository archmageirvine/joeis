package irvine.oeis.a263;

import irvine.oeis.FiniteSequence;

/**
 * A263881 Numbers k such that k! is a "compact factorial", i.e., k! is in A169661.
 * @author Georg Fischer
 */
public class A263881 extends FiniteSequence {

  /** Construct the sequence. */
  public A263881() {
    super(1, FINITE, 1, 2, 3, 6, 7, 10, 11);
  }
}
