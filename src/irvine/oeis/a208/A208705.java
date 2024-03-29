package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208705 Number of n X 4 0..1 arrays with new values 0..1 introduced in row major order and no element equal to more than two of its immediate leftward or upward or right-upward antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A208705 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A208705() {
    super(1, new long[] {0, 8, -4},
      new long[] {1, -13, 4});
  }
}
