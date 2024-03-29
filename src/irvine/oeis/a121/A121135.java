package irvine.oeis.a121;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A121135 Numbers of isomers of unbranched a-4-catapolypentagons - see Brunvoll reference for precise definition.
 * @author Georg Fischer
 */
public class A121135 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A121135() {
    super(3, new long[] {0, 0, 0, 1, -6, 12, -2, -18, 0, 30, 8, -40, 0, 16},
      new long[] {1, -8, 20, 0, -76, 96, 32, -128, 64});
  }
}
