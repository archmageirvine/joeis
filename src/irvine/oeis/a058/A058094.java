package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058094 Number of 321-hexagon-avoiding permutations in S_n, i.e., permutations of <code>1..n</code> with no submatrix equivalent to <code>321, 56781234, 46781235, 56718234</code> or 46718235.
 * @author Sean A. Irvine
 */
public class A058094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058094() {
    super(new long[] {1, -4, -4, 9, -11, 6}, new long[] {1, 1, 2, 5, 14, 42});
  }
}
