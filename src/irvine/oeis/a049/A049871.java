package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049871.
 * @author Sean A. Irvine
 */
public class A049871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049871() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 3, 3, 6});
  }
}
