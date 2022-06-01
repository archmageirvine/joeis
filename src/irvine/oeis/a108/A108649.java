package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108649 a(n) = (n+1)(n+2)(n+3)(13n^3 + 69n^2 + 113n + 60)/360.
 * @author Sean A. Irvine
 */
public class A108649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108649() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 17, 111, 457, 1428, 3710, 8442});
  }
}
