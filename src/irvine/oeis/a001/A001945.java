package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001945.
 * @author Sean A. Irvine
 */
public class A001945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001945() {
    super(new long[] {-1, -1, 1, 3, 1, -1}, new long[] {0, 1, 1, 1, 5, 1});
  }
}
