package irvine.oeis.a101;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A101120 Records in A101119, which forms the nonzero differences of A006519 and A003484.
 * @author Georg Fischer
 */
public class A101120 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A101120() {
    super(1, new long[] {0, -7, -1},
      new long[] {-1, 3, -2, 0, 1, -3, 2});
  }
}
