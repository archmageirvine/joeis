package irvine.oeis.a225;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A225030 Non-crossing, non-nesting, 4-colored set partitions.
 * @author Georg Fischer
 */
public class A225030 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A225030() {
    super(0, new long[] {1, -20, 122, -224, 1},
      new long[] {1, -25, 218, -782, 973, -1});
  }
}
