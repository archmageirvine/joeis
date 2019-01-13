package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105899.
 * @author Sean A. Irvine
 */
public class A105899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105899() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 1, 2, 2, 3});
  }
}
