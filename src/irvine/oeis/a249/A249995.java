package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249995.
 * @author Sean A. Irvine
 */
public class A249995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249995() {
    super(new long[] {-24, 2, 5}, new long[] {1, 5, 27});
  }
}
