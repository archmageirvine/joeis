package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228290 a(n) = n^6 + n^5 + n^4 + n^3 + n^2 + n.
 * @author Georg Fischer
 */
public class A228290 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228290() {
    super(0, new long[] {0, -6, -84, -336, -252, -42},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
