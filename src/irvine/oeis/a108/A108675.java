package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A108675 a(n) = (n+1)*(n+2)*(61*n^4 + 366*n^3 + 845*n^2 + 888*n + 360)/720.
 * @author Georg Fischer
 */
public class A108675 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108675() {
    super(0, new long[] {1, 14, 31, 14, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
