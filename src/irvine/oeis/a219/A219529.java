package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A219529 Coordination sequence for 3.3.4.3.4 Archimedean tiling.
 * @author Georg Fischer
 */
public class A219529 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A219529() {
    super(0, new long[] {1, 4, 6, 4, 1},
      new long[] {1, -1, 0, -1, 1});
  }
}
