package irvine.oeis.a239;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A239077 Number of self-inverse permutations p on [n] with displacement of elements restricted by 5: |p(i)-i| &lt;= 5.
 * @author Georg Fischer
 */
public class A239077 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A239077() {
    super(0, new long[] {1, 0, -2, -2, -2, 2, -4, -6, 2, 2, -2, 2, 10, 0, 0, 0, 0, 
      -2, 0, 0, 0, 0, -1},
      new long[] {1, -1, -3, -1, -1, 1, -19, -27, -13, -5, 19, 52, 64, 12, 20, 
      0, -36, -40, 8, 0, -16, -8, -1, -3, -5, 1, 5, 7, -1, -1, 1, 
      1, 1});
  }
}
