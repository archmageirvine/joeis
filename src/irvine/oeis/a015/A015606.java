package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015606 a(n) = 11*a(n-1) + 10*a(n-2).
 * @author Sean A. Irvine
 */
public class A015606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015606() {
    super(new long[] {10, 11}, new long[] {0, 1});
  }
}
