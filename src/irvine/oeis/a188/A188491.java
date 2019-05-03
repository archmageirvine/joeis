package irvine.oeis.a188;

import irvine.oeis.RatPolyGfSequence;

/**
 * A188491 Number of permutations p on the set <code>[n]</code> with the properties that <code>abs(p(i)-i) &lt;= 3</code> for all i, <code>p(1) &lt;= 3</code>, and <code>p(4) &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A188491 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A188491() {
    super(new long[] {0, 1, 1, 1, -1, -3, -3, -1}, new long[] {1, -1, -3, -3, -13, -21, -19, -3, 7, 9, 5, 3, 3, 1});
  }
}
