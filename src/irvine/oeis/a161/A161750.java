package irvine.oeis.a161;

import irvine.oeis.FiniteSequence;

/**
 * A161750 Numbers n such that the decimal digits of <code>123456789*n</code> are all distinct.
 * @author Georg Fischer
 */
public class A161750 extends FiniteSequence {

  /** Construct the sequence. */
  public A161750() {
    super(0, 1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 20, 22, 23, 25, 26, 31, 32, 34, 35, 40, 41, 43, 44, 50, 52, 53, 61, 62, 70, 71, 80);
  }
}
