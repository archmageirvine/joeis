package irvine.oeis.a216;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A216938 Number of side-2 hexagonal 0..n arrays with values nondecreasing E, SW and SE.
 * @author Georg Fischer
 */
public class A216938 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A216938() {
    super(1, new long[] {0, 10, -27, 56, -70, 56, -28, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
