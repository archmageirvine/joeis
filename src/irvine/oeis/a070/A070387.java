package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A070387 a(n) = 5^n mod 41.
 * @author Georg Fischer
 */
public class A070387 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070387() {
    super(0, new long[] {-1, -4, -20, 23, -8, 1, 5, -16, 2, 10, -33},
      new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1});
  }
}
