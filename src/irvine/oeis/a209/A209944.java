package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209944 Half the number of (n+1) X 2 0..2 arrays with every 2 X 2 subblock having at most one duplicate clockwise edge difference.
 * @author Georg Fischer
 */
public class A209944 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A209944() {
    super(1, new long[] {0, 34, 54},
      new long[] {1, -6, -12});
  }
}
