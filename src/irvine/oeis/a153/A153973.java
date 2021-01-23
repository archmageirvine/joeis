package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153973 a(n+1) = 2*(a(n) - 2) - 2, with a(0)=9.
 * @author Sean A. Irvine
 */
public class A153973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153973() {
    super(new long[] {-2, 3}, new long[] {9, 12});
  }
}
