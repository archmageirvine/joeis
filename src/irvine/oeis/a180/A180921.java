package irvine.oeis.a180;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A180921 Numbers a(n) whose square equals sums of cubes of b(n) consecutive integers starting from b(n), where b(n)= A180920.
 * @author Georg Fischer
 */
public class A180921 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A180921() {
    super(1, new long[] {0, 1, -1825, -1825, 1},
      new long[] {1, -3904, 238206, -3904, 1});
  }
}
