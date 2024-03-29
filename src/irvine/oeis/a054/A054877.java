package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054877 Closed walks of length n along the edges of a pentagon based at a vertex.
 * @author Georg Fischer
 */
public class A054877 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054877() {
    super(0, new long[] {25, -25, -25},
      new long[] {25, -25, -75, 50});
  }
}
