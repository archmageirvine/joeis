package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247618 Start with a single square; at n-th generation add a square at each expandable vertex; <code>a(n)</code> is the sum of all label values at n-th generation. (See comment for construction rules.).
 * @author Sean A. Irvine
 */
public class A247618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247618() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 17});
  }
}
