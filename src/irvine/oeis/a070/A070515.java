package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A070515 a(n) = n^4 mod 11.
 * @author Georg Fischer
 */
public class A070515 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070515() {
    super(0, new long[] {0, 1, 5, 4, 3, 9, 9, 3, 4, 5, 1},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
