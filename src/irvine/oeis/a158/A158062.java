package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158062 a(n) = 36*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158062() {
    super(new long[] {1, -3, 3}, new long[] {34, 140, 318});
  }
}
