package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102083.
 * @author Sean A. Irvine
 */
public class A102083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102083() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 41});
  }
}
