package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A238923 Number of (n+1) X (1+1) 0..3 arrays with no element greater than all horizontal neighbors or equal to all vertical neighbors.
 * @author Georg Fischer
 */
public class A238923 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A238923() {
    super(1, new long[] {0, 12},
      new long[] {1, -3, -3});
  }
}
