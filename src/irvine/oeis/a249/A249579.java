package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249579.
 * @author Sean A. Irvine
 */
public class A249579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249579() {
    super(new long[] {1, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 1, 0, 1, 1, 2, 3});
  }
}
