package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A131804 Antidiagonal sums of triangular array T: T(j,k) = -(k+1)/2 for odd k, T(j,k) = 0 for k = 0, T(j,k) = j+1-k/2 for even k &gt; 0; 0 &lt;= k &lt;= j.
 * @author Georg Fischer
 */
public class A131804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131804() {
    super(0, new long[] {0, 0, -1, 2, -1, 1},
      new long[] {1, -3, 5, -7, 7, -5, 3, -1});
  }
}
