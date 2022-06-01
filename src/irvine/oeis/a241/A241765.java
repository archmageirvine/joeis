package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241765 a(n) = n*(n + 1)*(n + 2)*(3*n + 17)/24.
 * @author Sean A. Irvine
 */
public class A241765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241765() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 23, 65, 145});
  }
}
