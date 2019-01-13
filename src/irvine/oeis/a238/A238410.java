package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238410.
 * @author Sean A. Irvine
 */
public class A238410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238410() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 6, 14});
  }
}
