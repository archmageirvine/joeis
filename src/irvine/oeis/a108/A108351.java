package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108351.
 * @author Sean A. Irvine
 */
public class A108351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108351() {
    super(new long[] {1, 0, -1, -2, 1, 2}, new long[] {1, 1, 2, 3, 5, 8});
  }
}
