package irvine.oeis.a095;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A095663 Eighth column (m=7) of (1,3)-Pascal triangle A095660.
 * @author Georg Fischer
 */
public class A095663 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A095663() {
    super(0, new long[] {3, -2},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
