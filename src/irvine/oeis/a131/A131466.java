package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A131466 a(n) = 5n^4 - 4n^3 + 3n^2 - 2n + 1.
 * @author Georg Fischer
 */
public class A131466 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131466() {
    super(0, new long[] {-1, 2, -52, -54, -15},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
