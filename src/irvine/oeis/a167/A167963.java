package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167963.
 * @author Sean A. Irvine
 */
public class A167963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167963() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 33, 366, 2050, 7815, 23331});
  }
}
