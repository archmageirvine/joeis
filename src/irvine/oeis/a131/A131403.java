package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A131403 Row sums of triangle A131402.
 * @author Georg Fischer
 */
public class A131403 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131403() {
    super(0, new long[] {1, -3, 3, -2, 2},
      new long[] {1, -5, 8, -3, -3, 2});
  }
}
