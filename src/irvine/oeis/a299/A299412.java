package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A299412 Pentagonal pyramidal numbers divisible by 3.
 * @author Georg Fischer
 */
public class A299412 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299412() {
    super(0, new long[] {0, 6, 12, 39, 15, 9},
      new long[] {1, -1, -3, 3, 3, -3, -1, 1});
  }
}
