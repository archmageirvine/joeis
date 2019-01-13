package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180665.
 * @author Sean A. Irvine
 */
public class A180665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180665() {
    super(new long[] {1, -2, -3, 3, 2}, new long[] {0, 1, 2, 7, 17});
  }
}
