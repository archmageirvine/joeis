package irvine.oeis.a319;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A319258 a(n) = 1 + 2*3 + 4 + 5*6 + 7 + 8*9 + 10 + 11*12 + ... + (up to n).
 * @author Georg Fischer
 */
public class A319258 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A319258() {
    super(1, new long[] {0, 1, 2, 4, 1, -1, 13, -2, -1, 1},
      new long[] {1, -1, 0, -3, 3, 0, 3, -3, 0, -1, 1});
  }
}
