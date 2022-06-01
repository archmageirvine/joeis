package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193448 a(n) = 4*(5*n^2 - 5*n + 1).
 * @author Sean A. Irvine
 */
public class A193448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193448() {
    super(new long[] {1, -3, 3}, new long[] {4, 44, 124});
  }
}
