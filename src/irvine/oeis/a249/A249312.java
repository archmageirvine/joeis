package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249312.
 * @author Sean A. Irvine
 */
public class A249312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249312() {
    super(new long[] {-10, 0, 12, 0}, new long[] {1, 11, 12, 122});
  }
}
