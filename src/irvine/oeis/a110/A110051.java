package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110051.
 * @author Sean A. Irvine
 */
public class A110051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110051() {
    super(new long[] {16, 0, -24, 4, 5}, new long[] {1, 4, 25, 119, 599});
  }
}
