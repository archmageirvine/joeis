package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049864.
 * @author Sean A. Irvine
 */
public class A049864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049864() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 1, 1, 2});
  }
}
