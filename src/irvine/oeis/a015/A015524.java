package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015524 a(n) = 3*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A015524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015524() {
    super(new long[] {7, 3}, new long[] {0, 1});
  }
}
