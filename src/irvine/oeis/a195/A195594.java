package irvine.oeis.a195;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A195594 Number of ways to place 6n nonattacking kings on a vertical cylinder 12 X 2n.
 * @author Georg Fischer
 */
public class A195594 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A195594() {
    super(1, new long[] {-1, -119, -984, -1352, -307, -9},
      new long[] {-1, 9, -34, 70, -85, 61, -24, 4});
  }
}
