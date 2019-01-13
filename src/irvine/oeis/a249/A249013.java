package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249013.
 * @author Sean A. Irvine
 */
public class A249013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249013() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 1, 2, 3, 5, 6});
  }
}
