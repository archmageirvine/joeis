package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249997.
 * @author Sean A. Irvine
 */
public class A249997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249997() {
    super(new long[] {-12, 11, 2}, new long[] {1, 2, 15});
  }
}
