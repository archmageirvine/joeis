package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229424 Number of n X 4 0..2 arrays with horizontal differences mod 3 never 1, vertical differences mod 3 never -1, rows lexicographically nondecreasing, and columns lexicographically nonincreasing.
 * @author Georg Fischer
 */
public class A229424 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A229424() {
    super(1, new long[] {0, 12, -53, 159, -272, 302, -222, 103, -27, 3},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
