package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081005.
 * @author Sean A. Irvine
 */
public class A081005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081005() {
    super(new long[] {1, -8, 8}, new long[] {3, 14, 90});
  }
}
