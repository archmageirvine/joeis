package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158491 a(n) = 20*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158491() {
    super(1, new long[] {1, -3, 3}, new long[] {19, 79, 179});
  }
}
