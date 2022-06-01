package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111352 a(n+3) = a(n+2) + 3*a(n+1) + a(n).
 * @author Sean A. Irvine
 */
public class A111352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111352() {
    super(new long[] {1, 3, 1}, new long[] {1, -1, 2});
  }
}
