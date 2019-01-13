package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266667.
 * @author Sean A. Irvine
 */
public class A266667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266667() {
    super(new long[] {-100000, -10000, 100010, 10001, -10}, new long[] {1, 101, 100, 1110111, 10000});
  }
}
