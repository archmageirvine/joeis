package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158408 a(n) = 900*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158408() {
    super(1, new long[] {1, -3, 3}, new long[] {898, 3596, 8094});
  }
}
