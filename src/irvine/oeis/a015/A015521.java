package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015521 a(n) = 3*a(n-1) + 4*a(n-2), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015521() {
    super(new long[] {4, 3}, new long[] {0, 1});
  }
}
