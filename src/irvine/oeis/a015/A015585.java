package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015585 a(n) = 9*a(n-1) + 10*a(n-2).
 * @author Sean A. Irvine
 */
public class A015585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015585() {
    super(new long[] {10, 9}, new long[] {0, 1});
  }
}
