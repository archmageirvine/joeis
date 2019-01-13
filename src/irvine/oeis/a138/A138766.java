package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138766.
 * @author Sean A. Irvine
 */
public class A138766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138766() {
    super(new long[] {-1, 0, -4, 4}, new long[] {1, 2, 4, 7});
  }
}
