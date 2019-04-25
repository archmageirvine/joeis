package irvine.oeis.a188;

import irvine.oeis.RatPolyGfSequence;

/**
 * A188491 Number of permutations p on the set <code>[n]</code> with the properties that abs(p(i)-i) <code>&lt;= 3</code> for all <code>i,</code> p(1) <code>&lt;= 3,</code> and p(4) <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A188491 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A188491() {
    super(new long[] {0, 1, 1, 1, -1, -3, -3, -1}, new long[] {1, -1, -3, -3, -13, -21, -19, -3, 7, 9, 5, 3, 3, 1});
  }
}
