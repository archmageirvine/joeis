package irvine.oeis.a158;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A158780 a(2n) = A131577(n), a(2n+1) = A011782(n).
 * @author Georg Fischer
 */
public class A158780 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A158780() {
    super(0, new long[] {0, 1, 1, -1},
      new long[] {1, 0, -2});
  }
}
