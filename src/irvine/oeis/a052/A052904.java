package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052904.
 * @author Sean A. Irvine
 */
public class A052904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052904() {
    super(new long[] {-4, 4, 2}, new long[] {1, 1, 6});
  }
}
