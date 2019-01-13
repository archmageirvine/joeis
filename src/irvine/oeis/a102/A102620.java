package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102620.
 * @author Sean A. Irvine
 */
public class A102620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102620() {
    super(new long[] {1, -1, 3}, new long[] {1, 5, 15});
  }
}
