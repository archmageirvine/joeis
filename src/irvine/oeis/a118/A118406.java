package irvine.oeis.a118;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A118406 Unsigned row sums of triangle A118404.
 * @author Georg Fischer
 */
public class A118406 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A118406() {
    super(0, new long[] {1, 0, -2, 0, -5},
      new long[] {1, -2, 0, 0, -1, 2});
  }
}
