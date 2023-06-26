package irvine.oeis.a187;

import irvine.oeis.FiniteSequence;

/**
 * A187127 Triangular numbers k*(k+1)/2 mod 100, sorted and uniqued.
 * @author Georg Fischer
 */
public class A187127 extends FiniteSequence {

  /** Construct the sequence. */
  public A187127() {
    super(1, FINITE, 0, 1, 3, 5, 6, 10, 11, 15, 16, 20, 21, 25, 26, 28, 30, 31, 35, 36, 40, 41, 45, 46, 50, 51, 53, 55, 56, 60, 61, 65, 66, 70, 71, 75, 76, 78, 80, 81, 85, 86, 90, 91, 95, 96);
  }
}
