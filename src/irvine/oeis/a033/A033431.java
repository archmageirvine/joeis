package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033431 <code>a(n) = 2*n^3</code>.
 * @author Sean A. Irvine
 */
public class A033431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033431() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 16, 54});
  }
}
