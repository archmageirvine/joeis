package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209008 Number of 4-bead necklaces labeled with numbers -n..n not allowing reversal, with sum zero and first and second differences in -n..n.
 * @author Georg Fischer
 */
public class A209008 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A209008() {
    super(1, new long[] {0, 1, 0, -2, 3, -1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
