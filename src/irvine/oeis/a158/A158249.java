package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158249 a(n) = 256*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158249() {
    super(new long[] {1, -3, 3}, new long[] {254, 1020, 2298});
  }
}
