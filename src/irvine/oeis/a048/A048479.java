package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048479 a(n) = T(7,n), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048479() {
    super(new long[] {4, -8, 5}, new long[] {1, 9, 33});
  }
}
