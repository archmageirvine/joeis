package irvine.oeis.a207;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A207059 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x+289)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A207059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207059() {
    super(new long[] {1, -1, 0, 0, 0, -6, 6, 0, 0, 0, 1}, new long[] {119, 231, 300, 476, 867, 1496, 2120, 2511, 3519, 5780, 9435});
  }
}
