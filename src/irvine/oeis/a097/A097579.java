package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A097579 Triangular numbers k such that 2*k-1 is also a triangular number.
 * @author Georg Fischer
 */
public class A097579 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097579() {
    super(1, new long[] {0, 1, -7, 1},
      new long[] {1, -35, 35, -1});
  }
}
