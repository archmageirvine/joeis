package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033445 <code>a(n) = (n - 1)*(n^2 + n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A033445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033445() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 0, 5, 22});
  }
}
