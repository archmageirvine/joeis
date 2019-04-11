package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123363 <code>a(n) = n^3 + (-1)^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A123363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123363() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {-1, 2, 7, 28, 63});
  }
}
