package irvine.oeis.a272;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A272912 Difference sequence of the sequence A116470 of all distinct Fibonacci numbers and Lucas numbers (A000032).
 * @author Georg Fischer
 */
public class A272912 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A272912() {
    super(1, new long[] {0, 1, 1, 0, 0, 0, -1},
      new long[] {1, 0, -1, 0, -1});
  }
}
