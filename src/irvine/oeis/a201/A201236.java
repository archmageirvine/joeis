package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A201236 Number of ways to place 2 non-attacking wazirs on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A201236 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A201236() {
    super(1, new long[] {0, 0, -2, -8, -18, 30, -18, 4},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
