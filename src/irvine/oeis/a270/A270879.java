package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270879.
 * @author Sean A. Irvine
 */
public class A270879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270879() {
    super(new long[] {1, 0, 0, 2, 1, 0, 1, 1}, new long[] {0, 1, 1, 2, 7, 10, 20, 34});
  }
}
