package irvine.oeis.a265;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A265725 Number of binary strings of length n having at least one run of length at least 4.
 * @author Georg Fischer
 */
public class A265725 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A265725() {
    super(0, new long[] {0, 0, 0, 0, 2},
      new long[] {1, -3, 1, 1, 2});
  }
}
