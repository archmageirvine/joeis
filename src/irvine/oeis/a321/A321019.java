package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A321019 Coordination sequence for 3-D tiling (Cairo tiling) X Z, with respect to a 5-valent point.
 * @author Georg Fischer
 */
public class A321019 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321019() {
    super(0, new long[] {-1, -2, -5, -4, -2, -3, 0, 1},
      new long[] {-1, 3, -4, 4, -3, 1});
  }
}
