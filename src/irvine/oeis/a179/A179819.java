package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179819 Numbers of cents such that the shortest way to get the value uses all denominations of dime and above.
 * @author Sean A. Irvine
 */
public class A179819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179819() {
    super(new long[] {-1, 1, 0, 1}, new long[] {10, 20, 25, 35});
  }
}
