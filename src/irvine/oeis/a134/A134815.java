package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134815.
 * @author Sean A. Irvine
 */
public class A134815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134815() {
    super(new long[] {-1, 0, 0, -6, 2, 0, -5, 6}, new long[] {4, 9, 35, 162, 790, 3923, 19602, 98108});
  }
}
