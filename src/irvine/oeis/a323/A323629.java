package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A323629 List of 6-powerful numbers (for the definition of k-powerful see A323395).
 * @author Georg Fischer
 */
public class A323629 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323629() {
    super(1, new long[] {0, 96, -64, -16, 0, 0, 0, -8},
      new long[] {1, -2, 1});
  }
}
