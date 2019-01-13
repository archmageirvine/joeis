package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037559.
 * @author Sean A. Irvine
 */
public class A037559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037559() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 211, 2112});
  }
}
