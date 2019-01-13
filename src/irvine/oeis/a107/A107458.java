package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107458.
 * @author Sean A. Irvine
 */
public class A107458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107458() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 0, 0});
  }
}
