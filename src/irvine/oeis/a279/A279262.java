package irvine.oeis.a279;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A279262 Number of n X 2 0..1 arrays with no element equal to a strict majority of its horizontal and vertical neighbors, with the exception of exactly one element, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A279262 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A279262() {
    super(1, new long[] {0, 0, 4, -2, -6},
      new long[] {1, -3, 1, 3, -1, -1});
  }
}
