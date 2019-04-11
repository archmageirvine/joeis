package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113224 <code>a(2n) =</code> A002315(n), <code>a(2n+1) =</code> A082639(n+1).
 * @author Sean A. Irvine
 */
public class A113224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113224() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 2, 7, 16});
  }
}
