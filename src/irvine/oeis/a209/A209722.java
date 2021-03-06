package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209722 1/4 the number of (n+1) X 4 0..2 arrays with every 2 X 2 subblock having distinct clockwise edge differences.
 * @author Georg Fischer
 */
public class A209722 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A209722() {
    super(1, new long[] {0, 4, 1, -7},
      new long[] {1, -1, -2, 2});
  }
}
