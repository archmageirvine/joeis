package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A304512 a(n) = 366*2^n - 204 (n &gt;= 1).
 * @author Georg Fischer
 */
public class A304512 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304512() {
    super(1, new long[] {0, 528, -324},
      new long[] {1, -3, 2});
  }
}
