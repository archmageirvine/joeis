package irvine.oeis.a209;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A209294 a(n) = (7*n^2 - 7*n + 4)/2.
 * @author Sean A. Irvine
 */
public class A209294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209294() {
    super(1, new long[] {1, -3, 3}, new long[] {2, 9, 23});
  }
}
