package irvine.oeis.a265;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A265075 Coordination sequence for (3,4,4) tiling of hyperbolic plane.
 * @author Georg Fischer
 */
public class A265075 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A265075() {
    super(0, new long[] {1, 3, 5, 6, 5, 3, 1},
      new long[] {1, 0, -1, -2, -1, 0, 1});
  }
}
