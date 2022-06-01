package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161365 a(n) = 3/2 + 5*n - 5*(-1)^n/2.
 * @author Sean A. Irvine
 */
public class A161365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161365() {
    super(new long[] {-1, 1, 1}, new long[] {9, 9, 19});
  }
}
