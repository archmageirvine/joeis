package irvine.oeis.a076;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A076455 Sum of numbers that can be written as t*n + u*(n+1) for nonnegative integers t,u in exactly two ways.
 * @author Georg Fischer
 */
public class A076455 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A076455() {
    super(1, new long[] {0, 5, 32, 11},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
