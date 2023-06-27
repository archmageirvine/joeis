package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168240 1+7*n+13*n^2.
 * @author Sean A. Irvine
 */
public class A168240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168240() {
    super(1, new long[] {1, -3, 3}, new long[] {21, 67, 139});
  }
}
