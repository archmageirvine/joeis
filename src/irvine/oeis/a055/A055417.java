package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A055417 Number of points in N^n of norm &lt;= 2.
 * @author Georg Fischer
 */
public class A055417 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055417() {
    super(0, new long[] {1, -2, 1, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
