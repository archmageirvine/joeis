package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158447 a(n) = 10*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158447() {
    super(1, new long[] {1, -3, 3}, new long[] {9, 39, 89});
  }
}
