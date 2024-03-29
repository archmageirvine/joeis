package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229423 Number of n X 3 0..2 arrays with horizontal differences mod 3 never 1, vertical differences mod 3 never -1, rows lexicographically nondecreasing, and columns lexicographically nonincreasing.
 * @author Georg Fischer
 */
public class A229423 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A229423() {
    super(1, new long[] {0, 8, -29, 62, -72, 48, -18, 3},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
