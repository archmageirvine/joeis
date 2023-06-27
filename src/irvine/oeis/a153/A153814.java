package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153814 a(n) = 1001*n.
 * @author Sean A. Irvine
 */
public class A153814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153814() {
    super(1, new long[] {-1, 2}, new long[] {1001, 2002});
  }
}
