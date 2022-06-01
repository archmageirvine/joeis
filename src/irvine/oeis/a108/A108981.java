package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108981 a(n) = 3a(n-1) + 4a(n-2), a(0) = 1, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A108981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108981() {
    super(new long[] {4, 3}, new long[] {1, 5});
  }
}
