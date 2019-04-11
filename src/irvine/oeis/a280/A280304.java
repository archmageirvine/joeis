package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280304 <code>a(n) = 3*n*(n^2 + 3*n + 4)</code>.
 * @author Sean A. Irvine
 */
public class A280304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280304() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 24, 84, 198});
  }
}
