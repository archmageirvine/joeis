package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217758 Triangular numbers of the form k^2 + k - 1.
 * @author Sean A. Irvine
 */
public class A217758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217758() {
    super(1, new long[] {1, -35, 35}, new long[] {1, 55, 1891});
  }
}
