package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188494 Number of permutations p on the set [n] with the properties that abs(p(i)-i) &lt;= 3 for all i and p(1) &lt;= 2.
 * @author Sean A. Irvine
 */
public class A188494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188494() {
    super(new long[] {-1, -3, -3, -5, -9, -7, 3, 19, 21, 13, 3, 3, 1}, new long[] {0, 1, 2, 4, 12, 42, 138, 414, 1235, 3764, 11604, 35664, 109132});
  }
}
