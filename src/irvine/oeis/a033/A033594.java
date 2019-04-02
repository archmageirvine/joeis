package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033594 a(n) = (n-1)*(2*n-1)*(3*n-1).
 * @author Sean A. Irvine
 */
public class A033594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033594() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 0, 15, 80});
  }
}
