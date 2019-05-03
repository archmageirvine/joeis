package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113224 <code>a(2n) = A002315(n), a(2n+1) = A082639(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A113224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113224() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 2, 7, 16});
  }
}
