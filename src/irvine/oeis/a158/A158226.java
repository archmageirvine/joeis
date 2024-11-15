package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158226 a(n) = 225*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158226() {
    super(1, new long[] {1, -3, 3}, new long[] {223, 896, 2019});
  }
}
