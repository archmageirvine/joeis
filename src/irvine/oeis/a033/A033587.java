package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033587.
 * @author Sean A. Irvine
 */
public class A033587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033587() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 44});
  }
}
