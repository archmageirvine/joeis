package irvine.oeis.a347;
// manually linrec/linrec2 at 2022-04-29 07:28

import irvine.oeis.recur.LinearRecurrence;

/**
 * A347941 For sets of n random points in the real plane, a(n) is an upper bound for the minimal number of nearest neighbors.
 * @author Georg Fischer
 */
public class A347941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A347941() {
    super(2, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {2, 2, 2, 2, 2, 2, 3, 3, 3, 4}, new long[] {2, 2});
  }
}
