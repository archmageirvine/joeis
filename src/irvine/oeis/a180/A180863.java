package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180863 a(n) = n*(4*n-5).
 * @author Sean A. Irvine
 */
public class A180863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180863() {
    super(2, new long[] {1, -3, 3}, new long[] {6, 21, 44});
  }
}
