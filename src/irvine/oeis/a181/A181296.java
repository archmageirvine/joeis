package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181296 The number of odd entries in all the 2-compositions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A181296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181296() {
    super(new long[] {-4, 12, -4, -12, 7}, new long[] {0, 2, 10, 48, 208});
  }
}
