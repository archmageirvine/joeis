package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102909.
 * @author Sean A. Irvine
 */
public class A102909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102909() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 9, 511, 9841, 87381, 488281, 2015539, 6725601, 19173961});
  }
}
