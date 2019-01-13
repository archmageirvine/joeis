package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033437.
 * @author Sean A. Irvine
 */
public class A033437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033437() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 14});
  }
}
