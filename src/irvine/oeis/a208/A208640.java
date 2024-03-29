package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208640 Number of 5 X n 0..1 arrays with new values 0..1 introduced in row major order and no element equal to more than one of its immediate leftward or upward or right-upward antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A208640 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A208640() {
    super(1, new long[] {0, 16, -7, -26, 8, 16, -2, -4},
      new long[] {1, -6, 14, -16, 9, -2});
  }
}
