package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051942 a(n) = n*(n+1)/2 - 45.
 * @author Sean A. Irvine
 */
public class A051942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051942() {
    super(9, new long[] {1, -3, 3}, new long[] {0, 10, 21});
  }
}
