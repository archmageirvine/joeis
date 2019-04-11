package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174141 Numbers congruent to k <code>mod 25,</code> where <code>0 &lt;=</code> k <code>&lt;= 9</code>.
 * @author Sean A. Irvine
 */
public class A174141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174141() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 25});
  }
}
