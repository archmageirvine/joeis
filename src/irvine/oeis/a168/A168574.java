package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168574.
 * @author Sean A. Irvine
 */
public class A168574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168574() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 33, 95});
  }
}
