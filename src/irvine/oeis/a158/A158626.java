package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158626 a(n) = 42*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158626() {
    super(1, new long[] {1, -3, 3}, new long[] {41, 167, 377});
  }
}
