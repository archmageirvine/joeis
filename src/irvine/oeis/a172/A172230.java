package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172230 Number of ways to place 4 nonattacking wazirs on a 4 X n board.
 * @author Georg Fischer
 */
public class A172230 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172230() {
    super(1, new long[] {0, 0, -2, -51, -120, -67, -12, -4},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
