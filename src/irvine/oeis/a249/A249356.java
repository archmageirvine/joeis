package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249356.
 * @author Sean A. Irvine
 */
public class A249356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249356() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 17, 33, 49, 65, 97});
  }
}
