package irvine.oeis.a279;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A279735 Number of n X 2 0..1 arrays with no element equal to a strict majority of its horizontal and antidiagonal neighbors, with the exception of exactly one element, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A279735 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A279735() {
    super(1, new long[] {0, 0, 2, -4},
      new long[] {1, -6, 11, -6, 1});
  }
}
