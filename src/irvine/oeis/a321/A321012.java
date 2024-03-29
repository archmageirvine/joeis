package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A321012 Trajectory of 596 under repeated application of the map k -&gt; A320486(k^2).
 * @author Georg Fischer
 */
public class A321012 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321012() {
    super(1, new long[] {0, 596, 3216, 103425, 197325, 897162, 652, 2510, 631, 3986},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
