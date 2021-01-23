package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022265 a(n) = n*(7*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022265() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 15});
  }
}
