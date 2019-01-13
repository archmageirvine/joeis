package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033138.
 * @author Sean A. Irvine
 */
public class A033138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033138() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 4, 9});
  }
}
