package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224336.
 * @author Sean A. Irvine
 */
public class A224336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224336() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {155, 805, 2555, 6245, 12955});
  }
}
