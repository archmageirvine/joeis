package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048058 a(n) = n^2 + n + 11.
 * @author Sean A. Irvine
 */
public class A048058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048058() {
    super(new long[] {1, -3, 3}, new long[] {11, 13, 17});
  }
}
