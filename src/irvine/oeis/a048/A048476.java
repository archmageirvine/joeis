package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048476 a(n) = T(4,n), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048476() {
    super(new long[] {4, -8, 5}, new long[] {1, 6, 21});
  }
}
