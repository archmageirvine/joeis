package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033305 Number of permutations (p1,...,pn) such that 1 &lt;= |pk - k| &lt;= 2 for all k.
 * @author Sean A. Irvine
 */
public class A033305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033305() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {1, 0, 1, 2, 4});
  }
}
