package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124062 Number of ways to write n as <code>an</code> ordered sum of 1's, 2's and 3's such that no 2 precedes any 1.
 * @author Sean A. Irvine
 */
public class A124062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124062() {
    super(new long[] {-1, -1, -1, 1, 1, 1}, new long[] {1, 1, 2, 3, 5, 8});
  }
}
