package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A277209 Partial sums of repdigit numbers (A010785).
 * @author Georg Fischer
 */
public class A277209 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A277209() {
    super(0, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -11, 11, 0, 0, 0, 0, 0, 0, 0, 
      10, -10});
  }
}
