package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114688.
 * @author Sean A. Irvine
 */
public class A114688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114688() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 5, 11, 30});
  }
}
