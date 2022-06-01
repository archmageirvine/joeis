package irvine.oeis.a188;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188491 Number of permutations p on the set [n] with the properties that abs(p(i)-i) &lt;= 3 for all i, p(1) &lt;= 3, and p(4) &gt;= 2.
 * @author Sean A. Irvine
 */
public class A188491 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A188491() {
    super(new long[] {0, 1, 1, 1, -1, -3, -3, -1},
      new long[] {1, -1, -3, -3, -13, -21, -19, -3, 7, 9, 5, 3, 3, 1});
  }
}
