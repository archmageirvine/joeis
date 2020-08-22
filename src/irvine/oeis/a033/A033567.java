package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033567 a(n) = (2*n-1)*(4*n-1).
 * @author Sean A. Irvine
 */
public class A033567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033567() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 21});
  }
}
