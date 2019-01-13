package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051111.
 * @author Sean A. Irvine
 */
public class A051111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051111() {
    super(new long[] {-1, 3, -4, 2}, new long[] {1, 2, 0, -5});
  }
}
