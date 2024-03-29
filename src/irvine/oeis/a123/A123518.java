package irvine.oeis.a123;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A123518 Number of dumbbells in all possible arrangements of dumbbells on a 2 X n rectangular array of compartments.
 * @author Georg Fischer
 */
public class A123518 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A123518() {
    super(1, new long[] {0, 1, 2, -3, 2},
      new long[] {1, -6, 7, 8, -5, -2, 1});
  }
}
