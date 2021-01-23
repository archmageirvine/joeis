package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015531 Linear 2nd order recurrence: a(n) = 4*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A015531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015531() {
    super(new long[] {5, 4}, new long[] {0, 1});
  }
}
