package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125526 Numbers k for which the sum of the digits of k raised to the sum of the digits of k itself is equal to k. If "sumdigit" denotes the sum of the digits of a number then these are the numbers k such that k <code>= sumdigit(k^sumdigit(k))</code>.
 * @author Georg Fischer
 */
public class A125526 extends FiniteSequence {

  /** Construct the sequence. */
  public A125526() {
    super(1, 22, 34, 43, 54, 81, 82, 169, 187);
  }
}
