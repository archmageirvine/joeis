package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092264.
 * @author Sean A. Irvine
 */
public class A092264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092264() {
    super(new long[] {1, 0, 0, 0, -28, 0, 0, 0, 28, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 3, 5, 9, 17, 65, 117, 227});
  }
}
