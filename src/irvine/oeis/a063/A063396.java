package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A063396 T(3,n) with T(n,m) as in A063394.
 * @author Georg Fischer
 */
public class A063396 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A063396() {
    super(0, new long[] {1, 8, -40, 52, -20},
      new long[] {1, -7, 18, -20, 8});
  }
}
