package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136291 Array read by rows: each row is a sequence of numbers k such that n^k does not contain the digit n.
 * @author Georg Fischer
 */
public class A136291 extends FiniteSequence {

  /** Construct the sequence. */
  public A136291() {
    super(0, 2, 3, 4, 6, 12, 14, 16, 20, 22, 23, 26, 34, 35, 36, 39, 42, 46, 54, 64, 74, 83, 168, 0, 2, 3, 4, 6, 7, 8, 10, 11, 14, 19, 27, 28, 34, 40, 50, 55, 84, 0, 2, 4, 8, 12, 20, 0, 0, 0, 2, 3, 4, 7, 16, 22, 24, 39, 0, 2, 3, 4, 6, 7, 8, 26, 0, 2, 4, 6, 8, 10, 16, 28);
  }
}
