package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033121.
 * @author Sean A. Irvine
 */
public class A033121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033121() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 3, 10, 31});
  }
}
