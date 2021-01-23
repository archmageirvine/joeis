package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179272 Sharp upper bound on Rosgen overlap number n-vertex graph with n =&gt; 14, formula abused here for nonnegative integers.
 * @author Sean A. Irvine
 */
public class A179272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179272() {
    super(new long[] {1, -2, 0, 2}, new long[] {-1, -2, -1, -1});
  }
}
