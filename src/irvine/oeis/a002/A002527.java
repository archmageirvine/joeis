package irvine.oeis.a002;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A002527 Number of permutations p on the set <code>[n]</code> with the properties that <code>abs(p(i)-i) &lt;= 3</code> for all i and <code>p(1) &lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A002527 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002527() {
    super(new long[] {0, -1, 0, 0, -2, -2, 0, 2, 1},
      new long[] {-1, 2, 2, 0, 10, 8, -2, -16, -10, -2, 4, 2, 0, 2, 1});
  }
}
