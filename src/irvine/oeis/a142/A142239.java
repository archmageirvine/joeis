package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142239.
 * @author Sean A. Irvine
 */
public class A142239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142239() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 4, 9, 40});
  }
}
