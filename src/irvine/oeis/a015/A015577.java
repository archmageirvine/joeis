package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015577 a(n+1) = 8*a(n) + 9*a(n-1), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015577() {
    super(new long[] {9, 8}, new long[] {0, 1});
  }
}
