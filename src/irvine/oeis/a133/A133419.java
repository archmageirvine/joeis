package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A133419 Image of n under one application of the "5x+1" map.
 * @author Georg Fischer
 */
public class A133419 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133419() {
    super(1, new long[] {0, 6, 1, 1, 2, 26, 3, 24, 2, 1, 1, 4},
      new long[] {1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 1});
  }
}
