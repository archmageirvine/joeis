package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049856.
 * @author Sean A. Irvine
 */
public class A049856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049856() {
    super(new long[] {1, -1, 0, 2}, new long[] {0, 0, 1, 1});
  }
}
