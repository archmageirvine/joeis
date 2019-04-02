package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015565 a(n) = 7*a(n-1) + 8*a(n-2), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015565() {
    super(new long[] {8, 7}, new long[] {0, 1});
  }
}
