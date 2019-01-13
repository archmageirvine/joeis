package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098574.
 * @author Sean A. Irvine
 */
public class A098574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098574() {
    super(new long[] {1, 0, 0, 0, 0, -1, 2}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
