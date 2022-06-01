package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267706 a(n) = 137*n^2 - 4043*n + 27277.
 * @author Sean A. Irvine
 */
public class A267706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267706() {
    super(new long[] {1, -3, 3}, new long[] {27277, 23371, 19739});
  }
}
