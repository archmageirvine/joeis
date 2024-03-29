package irvine.oeis.a292;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A292540 Number of 3-cycles in the n-Sierpinski tetrahedron graph.
 * @author Georg Fischer
 */
public class A292540 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A292540() {
    super(1, new long[] {0, -4, -4},
      new long[] {-1, 4});
  }
}
