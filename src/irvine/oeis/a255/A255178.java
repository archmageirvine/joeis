package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255178 Second differences of eighth powers (A001016).
 * @author Georg Fischer
 */
public class A255178 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255178() {
    super(0, new long[] {1, 247, 4293, 15619, 15619, 4293, 247, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
