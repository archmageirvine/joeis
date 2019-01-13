package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049601.
 * @author Sean A. Irvine
 */
public class A049601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049601() {
    super(new long[] {1, -4, 3, 2}, new long[] {0, 0, 2, 3});
  }
}
