package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015532 a(n) = 4*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A015532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015532() {
    super(new long[] {7, 4}, new long[] {0, 1});
  }
}
