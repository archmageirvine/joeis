package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A083363 Diagonal of table A083362.
 * @author Georg Fischer
 */
public class A083363 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083363() {
    super(0, new long[] {-1, -6, -2, -7, -1, 1},
      new long[] {-1, 1, 2, -2, -1, 1});
  }
}
