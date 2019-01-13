package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249577.
 * @author Sean A. Irvine
 */
public class A249577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249577() {
    super(new long[] {1, 0, 0, -2, 0, 0}, new long[] {2, -1, 1, -4, 3, -2});
  }
}
