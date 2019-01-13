package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272576.
 * @author Sean A. Irvine
 */
public class A272576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272576() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 10});
  }
}
