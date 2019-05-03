package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188494 Number of permutations p on the set [n] with the properties that <code>abs(p(i)-i) &lt;= 3</code> for all i and <code>p(1) &lt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A188494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188494() {
    super(new long[] {-1, -3, -3, -5, -9, -7, 3, 19, 21, 13, 3, 3, 1}, new long[] {0, 1, 2, 4, 12, 42, 138, 414, 1235, 3764, 11604, 35664, 109132});
  }
}
