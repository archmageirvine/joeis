package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249453.
 * @author Sean A. Irvine
 */
public class A249453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249453() {
    super(new long[] {2, -5, 4}, new long[] {4, 3, 4});
  }
}
